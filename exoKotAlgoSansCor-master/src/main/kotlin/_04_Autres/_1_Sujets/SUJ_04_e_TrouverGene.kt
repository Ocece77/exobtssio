package _04_Autres._1_Sujets

import _10_Demos_et_tests.DataTestTrouverGene
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot


/**
 * La fonction prend en argument une 2 chaînes de caractères.
 * La 1ère chaîne est décrit gène et la 2e décrit à une séquence
 * ADN.
 * La fonction recherche la présence du gène dans la séquence ADN.
 * La fonction retourne true si le gène est trouvé et false en
 * absence du gène dans la séquence.
 * @param gene Chaîne de caractères codant le gène recherché.
 * @param seqADN Chaîne de caractères codant le séquence ADN faisant l'objet de la recherche du gène.
 * @return Un booléen notifiant de la présence ou pas du gène dans la séquence ADN.
 */


fun trouverGene(gene: String, seqADN: String): Boolean {

    // A COMPLETER ICI

    return false
}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_04e = DataTestTrouverGene(::trouverGene,"AATC", "GTACAAATCTTGCC", true)
val dataTest02_04e = DataTestTrouverGene(::trouverGene,"AGTC", "GTACAAATCTTGCC",false)
val dataTest03_04e = DataTestTrouverGene(::trouverGene,"GCC", "GTACAAATCTTGCC",true)
val dataTest04_04e = DataTestTrouverGene(::trouverGene,"GTA", "GTACAAATCTTGCC",true)
val listDataTests_04e = listOf(dataTest01_04e , dataTest02_04e, dataTest03_04e, dataTest04_04e)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_04e)
    demoEnLot(listDataTests_04e)
}


