package _03_Manipulation_dans_une_liste._1_Sujets

import _10_Demos_et_tests.DataTestListList
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot


/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * La fonction prend en argument une liste d'entiers.
 * La fonction copie la liste et applique et supprime les éventuelles
 * valeurs présentes plusieurs fois (doublons).
 * @param liste Liste d'entiers (Int)
 * @return Une copie de la liste donnée en argument sans les doublons.
 */

fun supprimerDoublons(liste: List<Int>): MutableList<Int> {
    // Copie de la liste :
    val listeCopie = liste.toMutableList()

    // A COMPLETER ICI

    return listeCopie
}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_03a = DataTestListList(::supprimerDoublons, listOf(5, 5, 1, 3, 1, 7, 9, 3), mutableListOf(5, 1, 3, 7, 9))
val dataTest02_03a = DataTestListList(::supprimerDoublons, listOf(1, 2, 3, 4, 5), mutableListOf(1, 2, 3, 4, 5))
val dataTest03_03a = DataTestListList(::supprimerDoublons, listOf(7, 7, 7, 7), mutableListOf(7))
val dataTest04_03a = DataTestListList(::supprimerDoublons, listOf(5), mutableListOf(5))
val listDataTests_03a = listOf(dataTest01_03a , dataTest02_03a, dataTest03_03a, dataTest04_03a)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_03a)
    demoEnLot(listDataTests_03a)
}