package _02_Les_classiques._1_Sujets

import _10_Demos_et_tests.*

/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * La fonction prend un entier et une liste d'entiers.
 * Elle retourne l'indice de la valeur grâce à un algorithme
 * de recherche dichotomique.
 * Si la valeur est absente, la fonction retournera -1.
 * @param val Valeur (Int) recherchée.
 * @param list Liste d'entiers (Int)
 * @return L'indice de la valeur recherchée, vaut -1 en absence de la valeur.
 */
fun rechercheDichotomique(cible: Int, list: List<Int>): Int {
    // A COMPLETER ICI

    // Absence de la valeur dans la liste :
    return -1
}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_02a = DataTestIntListInt(::rechercheDichotomique, 5, listOf(2, 3, 5, 7, 8, 11), 2)
val dataTest02_02a = DataTestIntListInt(::rechercheDichotomique, 3, listOf(3, 7, 8, 9, 13, 15), 0)
val dataTest03_02a = DataTestIntListInt(::rechercheDichotomique, 18, listOf(3, 7, 8, 9, 15, 18), 5)
val dataTest04_02a = DataTestIntListInt(::rechercheDichotomique, 10, listOf(3, 7, 8, 9, 15, 18), -1)
val listDataTests_02a = listOf(dataTest01_02a , dataTest02_02a, dataTest03_02a, dataTest04_02a)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_02a)
    demoEnLot(listDataTests_02a)
}