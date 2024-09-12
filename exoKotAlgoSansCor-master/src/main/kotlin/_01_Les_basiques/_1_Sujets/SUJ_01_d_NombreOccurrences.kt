package _01_Les_basiques._1_Sujets

import _10_Demos_et_tests.DataTestIntListInt
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot


/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * Fonction qui prend en argument une valeur entière et une liste d'entiers.
 * La fonction retourne le nombre d'occurrences de la valeur dans la liste.
 * @param target Valeur faisant l'objet de la recherche (cible).
 * @param list Liste d'entiers dans laquelle on recherche les occurrences.
 * @return Le nombre d'occurrences.
 */
fun nombreOccurrences(target: Int, list: List<Int>): Int {
    var count = 0
    // A COMPLETER ICI
    return count
}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_01d = DataTestIntListInt(::nombreOccurrences, 7, listOf<Int>(5, -10, 7, -20, 3, 2, 5, 7, 2, 7), 3)
val dataTest02_01d = DataTestIntListInt(::nombreOccurrences, 5, listOf<Int>(-5, -10, -2, -100, -2, -3), 0 )
val listDataTests_01d = listOf(dataTest01_01d , dataTest02_01d)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_01d)
    demoEnLot(listDataTests_01d)
}