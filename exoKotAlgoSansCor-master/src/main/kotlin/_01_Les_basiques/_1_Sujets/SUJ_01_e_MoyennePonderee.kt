package _01_Les_basiques._1_Sujets

import _10_Demos_et_tests.DataTestMoyennePonderee
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot


/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * Fonction qui retourne la moyenne pondérée des valeurs passées en argument.
 * La valeur passée en argument est une liste de sous-listes. Chaque sous-liste
 * contient le coefficient à l'indice 0 et la valeur à l'indice 1.
 * @param listeCoefVal Liste de sous-listes [coef, val]
 * @return La moyenne pondérée.
 */
fun moyennePonderee(listeCoefVal: List<List<Number>>): Double {
    var moyenne = 0.0
    // A COMPLETER ICI
    return moyenne
}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_01e = DataTestMoyennePonderee(::moyennePonderee, listOf(listOf(1, 5.0), listOf(2, 10.0), listOf(1, 15), listOf(3, 10)), 10.0)
val dataTest02_01e = DataTestMoyennePonderee(::moyennePonderee, listOf(listOf(2, 15.0), listOf(1, 10.0), listOf(1, 20.0)), 15.0)
val listDataTests_01e = listOf(dataTest01_01e , dataTest02_01e)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_01e)
    demoEnLot(listDataTests_01e)
}

