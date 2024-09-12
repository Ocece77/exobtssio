package _04_Autres._1_Sujets

import _10_Demos_et_tests.DataTestMapDesOccurrences
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot

/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * La fonction prend en argument une liste d'entiers.
 * La fonction retourne une map ou chaque valeur présente dans la liste en argument
 * est mise en clé et la valeur associée à la clé représente le nombre d'occurrences de la valeur.
 * @param liste Liste de valeurs entières
 * @return Une map avec les valeurs en clé et les occurrences en valeur.
 */

fun mapDesOccurrences(liste: List<Int>): Map<Int, Int> {
    val resultat = mutableMapOf<Int, Int>()

    // A COMPLETER ICI

    return resultat
}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_04a = DataTestMapDesOccurrences(::mapDesOccurrences, listOf(1, 3, 1, 5, 1, 5, 2), mutableMapOf(1 to 3, 3 to 1, 5 to 2, 2 to 1))
val dataTest02_04a = DataTestMapDesOccurrences(::mapDesOccurrences, listOf(6, 1, 1, 5, 4), mutableMapOf(6 to 1, 1 to 2, 5 to 1, 4 to 1))
val listDataTests_04a = listOf(dataTest01_04a , dataTest02_04a)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_04a)
    demoEnLot(listDataTests_04a)
}
