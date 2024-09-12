package _04_Autres._1_Sujets

import _10_Demos_et_tests.DataTestAlgoGlouton
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot

/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * La fonction prend en argument la somme à rendre et une liste contenant les différentes valeurs de pièces du système
 * monétaire.
 * La fonction détermine selon un algorithme glouton la répartition des pièces pour rendre la monnaie.
 * @param somme Somme à rendre.
 * @return Un map décrivant le rendu de la monnaie où chaque clé est une valeur de pièce et la valeur le nombre de pièces.
 */

fun algoGloutonRenduMonnaie(somme: Double, pieces: List<Double>): Map<Double, Int> {
    var resteRendu = somme * 100 // Exprimé en centimes
    val renduDeMonnaie = mutableMapOf<Double, Int>()
    val renduDeMonnaieCentimes = mutableMapOf<Double, Int>()
    for (piece in pieces) {
        renduDeMonnaieCentimes[piece * 100] = 0 // Les montantes sont exprimés en centimes.
    }

    // A COMPLETER ICI

    // Conversion de centime vers unité monétaire :
    for (paire in renduDeMonnaieCentimes) {
        renduDeMonnaie[paire.key / 100] = paire.value
    }
    return renduDeMonnaie
}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_04b = DataTestAlgoGlouton(::algoGloutonRenduMonnaie,13.28, listOf(2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01),
    mutableMapOf(2.0 to 6, 1.0 to 1, 0.5 to 0, 0.2 to 1, 0.1 to 0, 0.05 to 1, 0.02 to 1, 0.01 to 1))
val dataTest02_04b = DataTestAlgoGlouton(::algoGloutonRenduMonnaie,7.88, listOf(2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01),
    mutableMapOf(2.0 to 3, 1.0 to 1, 0.5 to 1, 0.2 to 1, 0.1 to 1, 0.05 to 1, 0.02 to 1, 0.01 to 1))
val listDataTests_04b = listOf(dataTest01_04b , dataTest02_04b)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_04b)
    demoEnLot(listDataTests_04b)
}
