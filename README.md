# Projet compilateur langage dérivé Java.

### Compilation et option de compilation
La compilation d’un programme deca se fait via la commande decac dans le terminal suivi du chemin vers le fichier du programme deca. Pour l’exécuter de cette manière on doit cependant avoir initialisé le PATH, soit au préalable, soit directement dans les PATH dans notre fichier .bash.rc (ou .zsh.rc selon le système unix).
il y'a quelques différences avec le compilateur de l’énoncé, le notre permet d’imprimer des booléens notamment (true, false ou résultats d’opérations booléennes), certaines options n’ont pas pu être intégrées à temps (-n, -P, instanceof, ...).


### Présentation de la commande et ses options 
La commande decac peut-être appelé seule, elle va alors afficher toutes les options de compilations énumérées ci-dessous :

decac [[-p | -v] [-n] [-r X] <fichier deca>...] | [-b]
  
-p (parse) arrête decac après l’étape de construction de l’arbre, et
affiche la décompilation de ce dernier (i.e. s’il n’y a qu’un fichier source à compiler, la sortie doit etre un programme deca syntaxiquement correct).
  
-v (verification) arrete decac après l’étape de vérifications
(ne produit aucune sortie en l’absence d’erreur).
  
-n (no check) supprime les tests à l’exécution spécifiés dans les points 11.1 et 11.3 de la sémantique de deca.

-d (debug) active les traces de debug. Répéter l’option plusieurs fois pour avoir plus de traces.
  
-P (parallel) s’il y a plusieurs fichiers sources,
lance la compilation des fichiers en parallèle (pour accélérer la compilation)
  
  On remarque notamment que les options -p et -v sont incompatibles.

