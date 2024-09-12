package _01_Les_basiques._1_Sujets

import _10_Demos_et_tests.DataTestIntListInt
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot


/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * Prend en argument une valeur numérique et une liste de valeurs numériques
 * et retourne la dernière occurrence de la valeur recherchée.
 * Si la valeur est absente, la fonction retourne -1
 * @param value La valeur à chercher.
 * @param list Liste où chercher la valeur.
 * @return L'indice de la dernière occurrence de la valeur cherchée.
 */
fun findLastValue(value: Number, list: List<Number>): Int {
    var iVal = -1
    // A COMPLETER ICI
    return iVal
}


/* -------------------
    Données de test
   --------------------*/

val dataTest01_01c = DataTestIntListInt(::findLastValue, 7, listOf<Int>(5, -10, 7, -20, 3, 2, 5, 7, 2, 7), 9)
val dataTest02_01c = DataTestIntListInt(::findLastValue, 5, listOf<Int>(-5, -10, -2, -100, -2, -3), -1 )
val listDataTests_01c = listOf(dataTest01_01c , dataTest02_01c)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_01c)
    demoEnLot(listDataTests_01c)
}