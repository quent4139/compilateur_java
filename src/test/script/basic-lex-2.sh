#! /bin/sh

# On se place dans le répertoire du projet (quel que soit le
# répertoire d'où est lancé le script) :
cd "$(dirname "$0")"/../../.. || exit 1

PATH=./src/test/script/launchers:"$PATH"

GREEN=$'\e[32m'
RED=$'\e[31m'
NOCOLOR=$'\e[m'
TEST=$'\e[4;34m'

test_invalid_lex() {
    # à l'exécution de test context, on cherche s'il y a une erreur ou exception lancée
    # à l'avenir ou pourra vérifier automatiquement si la bonne erreur est levé en la mettant
    # dans les commentaires des tests ou en spécifiant les tests ou en enregistrant dans un fichier annexe
    if  test_lex "$1" 2>&1 | grep -q -e 'Erreur\|Exception\|Error'

    then
        echo $TEST"test lex$NOCOLOR: $cas_de_test - "$GREEN"PASSED"$NOCOLOR
    else
        echo $TEST"test lex$NOCOLOR: $cas_de_test - "$RED"NOT PASSED"$NOCOLOR
    fi
}

<<commentaires
for cas_de_test in src/test/deca/*/invalid/*.deca
do
  test_invalid_lex $cas_de_test
done
commentaires

test_invalid_lex src/test/deca/syntax/invalid/incomplete_string.deca
test_invalid_lex test lex: src/test/deca/syntax/invalid/test_parser_error_identifier-3.deca - PASSED


test_valid_lex() {
  # à l'exécution de test context, on cherche s'il y a une erreur ou exception lancée
  # à l'avenir ou pourra vérifier automatiquement si la bonne erreur est levé en la mettant
  # dans les commentaires des tests
  if test_lex "$1" 2>&1 | grep -q 'Exception\|Erreur\|ERROR'
  then
    echo $TEST"test lex$NOCOLOR: $cas_de_test - "$RED"NOT PASSED"$NOCOLOR

  else
    echo $TEST"test lex$NOCOLOR: $cas_de_test - "$GREEN"PASSED"$NOCOLOR
  fi
}

for cas_de_test in src/test/deca/*/valid/*.deca
do
  test_valid_lex $cas_de_test
done
