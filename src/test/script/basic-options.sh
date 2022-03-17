#! /bin/sh

# Le but est de profiter de l'option -p pour parcourir
# les decompiles

cd "$(dirname "$0")"/../../.. || exit 1

PATH=./src/test/script/launchers:"$PATH"

GREEN=$'\e[32m'
RED=$'\e[31m'
NOCOLOR=$'\e[m'
TEST=$'\e[4;34m'

decac_moins_p=$(decac -p)

decac_moins_p_valid () {
  if decac -p "$1" 2>&1 | grep 'Error\|Erreur\|Exception'
  then
    echo $TEST"test decac -p$NOCOLOR: $cas_de_test - "$RED"NOT PASSED"$NOCOLOR
  else
    echo $TEST"test decac -p$NOCOLOR: $cas_de_test - "$GREEN"PASSED"$NOCOLOR
  fi
}

for cas_de_test in src/test/deca/codegen/valid/*.deca
do
  decac_moins_p_valid $cas_de_test
done

decac_moins_v_valid () {
  if decac -v "$1" 2>&1 | grep 'Error\|Erreur\|Exception'
  then
    echo $TEST"test decac -v$NOCOLOR: $cas_de_test - "$RED"NOT PASSED"$NOCOLOR
  else
    echo $TEST"test decac -v$NOCOLOR: $cas_de_test - "$GREEN"PASSED"$NOCOLOR
  fi
}

for cas_de_test in src/test/deca/codegen/valid/*.deca
do
  decac_moins_v_valid $cas_de_test
done