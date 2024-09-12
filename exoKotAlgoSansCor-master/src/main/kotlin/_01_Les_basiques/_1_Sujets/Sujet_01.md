# SUJET 01 : Les basiques

## Présentation générale :
Cette partie propose des exercices faisant travailler sur le parcours de listes avec des traitements simples.

## Sujet 01-a : Chercher le max
Compléter la fonction `firstMax(list: List<Int>): List<Int>` qui prend en argument une liste d'entiers et qui retourne une liste qui comporte en 1ère valeur le maxi contenue dans la liste et en second en seconde valeur l'indice de la 1ère **occurrence** de la valeur maxi de la liste.

### EXEMPLE 1 :
* Liste donnée : [5, -10, 7, -20, 3, 2, 5, 7, 2, 7]
* Valeur maxi : 7
* Indice : 2

### EXEMPLE 2 :
* Liste donnée : [-5, -10, -2, -100, -2, -3]
* Valeur maxi : -2
* Indice : 2


## Sujet 02-b : Trouver la 1ère occurrence d'une valeur
Compléter la fonction `findFirstValue(value: Number, list: List<Number>): Int` afin qu'elle retourne l'indice de la 1ère occurrence de la valeur passée en argument. En absence de la valeur recherchée, la fonction retournera -1.

### EXEMPLE 1 :
* La valeur 7 avec [5, -10, 7, -20, 3, 2, 5, 7, 2, 7]
* Donne en résultat : 2

### EXEMPLE 2 :
* La valeur 5 avec [-5, -10, -2, -100, -2, -3]
* Donne en résultat : -1


## Sujet 02-c : Trouver la dernière occurrence d'une valeur
Compléter la fonction `findLastValue(value: Number, list: List<Number>): Int` afin qu'elle retourne l'indice de la dernière occurrence de la valeur passée en argument. En absence de la valeur recherchée, la fonction retournera -1.

### EXEMPLE 1 :
* La valeur 7 avec [5, -10, 7, -20, 3, 2, 5, 7, 2, 7]
* Donne en résultat : 9

### EXEMPLE 2 :
* La valeur 5 avec [-5, -10, -2, -100, -2, -3]
* Donne en résultat : -1


## Sujet 02-d : Trouver le nombre d'occurrences d'une valeur
Compléter la fonction `nombreOccurrences(target: Int, list: List<Int>): Int` afin qu'elle retourne le nombre d'occurrences de la valeur passée en argument.

### EXEMPLE 1 :
* La valeur 7 avec [5, -10, 7, -20, 3, 2, 5, 7, 2, 7]
* Donne en résultat : 3

### EXEMPLE 2 :
* La valeur 5 avec [-5, -10, -2, -100, -2, -3]
* Donne en résultat : 0


## Sujet 02-e : Calculer la moyenne pondérée de valeurs avec des coefficients
Compléter la fonction `moyennePonderee(listeCoefVal: List<List<Number>>): Double` afin qu'elle calcule et retourne la moyenne pondérée à partir de liste passée en argument.

### EXEMPLE 1 :
* La liste [[1, 5.0], [2, 10.0], [1, 15], [3, 10]] a pour moyenne : 10.0

### EXEMPLE 2 :
* La liste [[2, 15.0], [1, 10.0], [1, 20.0]] a pour moyenne : 15.0

