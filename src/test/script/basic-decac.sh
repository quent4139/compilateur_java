#! /bin/sh

# Test de l'interface en ligne de commande de decac.
# On ne met ici qu'un test trivial, a vous d'en ecrire de meilleurs.

PATH=./src/main/bin:"$PATH"

decac_moins_b=$(decac -b)
decac_moins_p=$(decac -p)
decac_moins_v=$(decac -v)

if [  $(decac -b) -ne 37 ]
 then
    echo "ERREUR: decac -b a termine avec un status different de zero."
    exit 1
fi

if [ $(decac -b) = "" ]
 then
    echo "ERREUR: decac -b n'a produit aucune sortie"
    exit 1
fi

if $(decac -b) 2>&1 | grep -e "erreur" -e "error"
 then
    echo "ERREUR: La sortie de decac -b contient erreur ou error"
    exit 1
fi

echo "Pas de probleme detecte avec decac -b."

if $(decac -p) src/test/deca/codegen/valid/test_plus.deca 2>&1 | grep -e 'Error\|Erreur\|Exception'
 then
    echo "ERREUR: decac -p n'a produit aucune sortie"
    exit 1
fi

if $(decac -p) src/test/deca/codegen/valid/test_plus.deca 2>&1 | grep -i -e "erreur" -e "error"
 then
    echo "ERREUR: La sortie de decac -p contient erreur ou error"
    exit 1
fi

echo "Pas de probleme detecte avec decac -p."

if $(decac -v) src/test/deca/codegen/valid/test_plus.deca 2>&1 | grep -i -e 'Error\|Erreur\|Exception'
 then
    echo "ERREUR: decac -v n'a produit aucune sortie"
    exit 1
fi

if $(decac -v) src/test/deca/codegen/valid/test_plus.deca 2>&1 | grep -i -e "erreur" -e "error"
 then
    echo "ERREUR: La sortie de decac -v contient erreur ou error"
    exit 1
fi

echo "Pas de probleme detecte avec decac -v."

