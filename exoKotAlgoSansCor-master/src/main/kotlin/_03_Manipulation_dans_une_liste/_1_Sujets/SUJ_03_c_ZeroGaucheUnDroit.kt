package _03_Manipulation_dans_une_liste._1_Sujets

import _10_Demos_et_tests.DataTestListList
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot

/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * La fonction prend en argument une liste ne comportant que des 0 et 1.
 * La fonction copie la liste et place tous les 0 à gauche et tous les 1 à droite.
 * @param liste Liste de 1 et 0(Int)
 * @return Une copie de la liste donnée avec les 0 à gauche et 1 à droite
 */

fun zeroGaucheUnDroit(liste: List<Int>): MutableList<Int> {
    val copieListe = liste.toMutableList()

    // A COMPLETER ICI

    return copieListe
}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_03c = DataTestListList(::zeroGaucheUnDroit, listOf(1, 0, 1, 0, 1, 0, 1), mutableListOf(0, 0, 0, 1, 1, 1, 1))
val dataTest02_03c = DataTestListList(::zeroGaucheUnDroit, listOf(1, 1, 1, 1, 1), mutableListOf(1, 1, 1, 1, 1))
val dataTest03_03c = DataTestListList(::zeroGaucheUnDroit, listOf(0, 0, 0, 0, 0), mutableListOf(0, 0, 0, 0, 0))
val dataTest04_03c = DataTestListList(::zeroGaucheUnDroit, listOf(1, 1, 0, 0, 0), mutableListOf(0, 0, 0, 1, 1))
val listDataTests_03c = listOf(dataTest01_03c , dataTest02_03c, dataTest03_03c, dataTest04_03c)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_03c)
    demoEnLot(listDataTests_03c)
}
