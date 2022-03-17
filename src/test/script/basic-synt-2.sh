#! /bin/sh

# On se place dans le répertoire du projet (quel que soit le
# répertoire d'où est lancé le script) :
cd "$(dirname "$0")"/../../.. || exit 1

PATH=./src/test/script/launchers:"$PATH"

GREEN=$'\e[32m'
RED=$'\e[31m'
NOCOLOR=$'\e[0m'
TEST=$'\e[34m'

test_invalid_synt() {
    if  test_synt "$1" 2>&1 | grep -q -e "$1:[0-9][0-9]*:"
    then
        echo $TEST"test synt$NOCOLOR: $cas_de_test - "$GREEN"PASSED"$NOCOLOR
    else
        echo $TEST"test synt$NOCOLOR: $cas_de_test - "$RED"NOT PASSED"$NOCOLOR
    fi
}

for cas_de_test in src/test/deca/syntax/invalid/*.deca
do
  test_invalid_synt $cas_de_test
done

test_valid_synt() {
  # à l'exécution de test context, on cherche s'il y a une erreur ou exception lancée
  # à l'avenir ou pourra vérifier automatiquement si la bonne erreur est levé en la mettant
  # dans les commentaires des tests
  if test_synt "$1" 2>&1 | grep -q -e '$1:[0-9][0-9]*:\|Erreur\|Error'
  then
    echo $TEST"test synt$NOCOLOR: $cas_de_test - "$RED"NOT PASSED"$NOCOLOR

  else
    echo $TEST"test synt$NOCOLOR: $cas_de_test - "$GREEN"PASSED"$NOCOLOR
  fi
}

for cas_de_test in src/test/deca/syntax/valid/*.deca
do
  test_valid_synt $cas_de_test
done
