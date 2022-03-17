#! /bin/sh

# On se place dans le répertoire du projet (quel que soit le
# répertoire d'où est lancé le script) :
cd "$(dirname "$0")"/../../.. || exit 1

PATH=./src/test/script/launchers:"$PATH"

GREEN=$'\e[32m'
RED=$'\e[31m'
NOCOLOR=$'\e[m'
TEST=$'\e[4;34m'

test_invalid_context() {
    # à l'exécution de test context, on cherche s'il y a une erreur ou exception lancée
    # à l'avenir ou pourra vérifier automatiquement si la bonne erreur est levé en la mettant
    # dans les commentaires des tests ou en spécifiant les tests ou en enregistrant dans un fichier annexe
    if  test_context "$1" 2>&1 | grep -q -e "$1:[0-9][0-9]*"

    then
        echo $TEST"test context$NOCOLOR: $cas_de_test - "$GREEN"PASSED"$NOCOLOR
    else
        echo $TEST"test context$NOCOLOR: $cas_de_test - "$RED"NOT PASSED"$NOCOLOR
    fi
}

for cas_de_test in src/test/deca/context/invalid/*.deca
do
  test_invalid_context $cas_de_test
done

test_valid_context() {
  # à l'exécution de test context, on cherche s'il y a une erreur ou exception lancée
  # à l'avenir ou pourra vérifier automatiquement si la bonne erreur est levé en la mettant
  # dans les commentaires des tests
  if test_context "$1" 2>&1 | grep -q "$1:[0-9][0-9]*:"
  then
    echo $TEST"test context$NOCOLOR: $cas_de_test - "$RED"NOT PASSED"$NOCOLOR

  else
    echo $TEST"test context$NOCOLOR: $cas_de_test - "$GREEN"PASSED"$NOCOLOR
  fi
}

for cas_de_test in src/test/deca/context/valid/*.deca
do
  test_valid_context $cas_de_test
done
