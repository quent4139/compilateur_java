#! /bin/sh

# On se place dans le répertoire du projet (quel que soit le
# répertoire d'où est lancé le script) :
cd "$(dirname "$0")"/../../.. || exit 1

PATH=./src/test/script/launchers:"$PATH"

GREEN=$'\e[32m'
RED=$'\e[31m'
NOCOLOR=$'\e[m'
TEST=$'\e[4;34m'

test_valid_codegen() {
    # à l'exécution de test context, on cherche s'il y a une erreur ou exception lancée
    # à l'avenir ou pourra vérifier automatiquement si la bonne erreur est levé en la mettant
    # dans les commentaires des tests ou en spécifiant les tests ou en enregistrant dans un fichier annexe
    NAME=$1
    filename="${NAME%.*}"
    rm -f $filename.ass 2>/dev/null
    if decac -d "$filename.deca" 2>&1| grep -e 'Error\|Erreur\|Exception'
    then
        echo $TEST"test codegen$NOCOLOR: $cas_de_test - "$RED"NOT PASSED"$NOCOLOR
    else
        echo $TEST"test codegen$NOCOLOR: $cas_de_test - "$GREEN"PASSED"$NOCOLOR
    fi
}

for cas_de_test in src/test/deca/codegen/valid/*.deca
do
  test_valid_codegen $cas_de_test
done

for cas_de_test in src/test/deca/codegen/valid/provided/*.deca
do
  test_valid_codegen $cas_de_test
done

for cas_de_test in src/test/deca/codegen/perf/provided/*.deca
do
  test_valid_codegen $cas_de_test
done

for cas_de_test in src/test/deca/context/valid/*.deca
do
  test_valid_codegen $cas_de_test
done

for cas_de_test in src/test/deca/context/valid/*.deca
do
  test_valid_codegen $cas_de_test
done

rm -f src/test/deca/context/valid/*.ass
rm -f src/test/deca/codegen/valid/*.ass
rm -f src/test/deca/s/syntax/valid/*.ass

