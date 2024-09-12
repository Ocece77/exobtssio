package _03_Manipulation_dans_une_liste._1_Sujets

import _10_Demos_et_tests.DataTestListList
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot

/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * La fonction prend en argument une liste d'entiers.
 * La fonction copie la liste et applique et inverse l'ordre des valeurs.
 * @param liste Liste d'entiers (Int)
 * @return Une copie de la liste donnée en argument avec les valeurs présente en ordre inverse.
 */
fun inverserListe(liste: List<Int>): MutableList<Int> {
    val copieListe = liste.toMutableList()

    // A COMPLETER ICI

    return copieListe
}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_03b = DataTestListList(::inverserListe, listOf(1, 2, 3, 4, 5), mutableListOf(5, 4, 3, 2, 1))
val dataTest02_03b = DataTestListList(::inverserListe, listOf(1), mutableListOf(1))
val listDataTests_03b = listOf(dataTest01_03b , dataTest02_03b)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_03b)
    demoEnLot(listDataTests_03b)
}