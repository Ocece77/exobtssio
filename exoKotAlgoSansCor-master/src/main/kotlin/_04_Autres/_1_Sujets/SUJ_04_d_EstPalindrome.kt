package _04_Autres._1_Sujets

import _10_Demos_et_tests.DataTestEstPalindrome
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot

/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * La fonction prend en argument une chaîne de caractère et retourne
 * un boolean qui sera à true si la chaîne fournie en argument est un
 * palindrome.
 * @param cle Clé de chiffrement (valeur de 1 à 26)
 * @param message Le message à chiffrer.
 * @return Un String représentant le message chiffré.
 */

fun estPalindrome(texte: String): Boolean {

    // A COMPLETER ICI

    return true
}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_04d = DataTestEstPalindrome(::estPalindrome,"non", true)
val dataTest02_04d = DataTestEstPalindrome(::estPalindrome,"coucou", false)
val dataTest03_04d = DataTestEstPalindrome(::estPalindrome,"oui", false)
val dataTest04_04d = DataTestEstPalindrome(::estPalindrome,"radar", true)
val dataTest05_04d = DataTestEstPalindrome(::estPalindrome,"tenet", true)
val listDataTests_04d = listOf(dataTest01_04d , dataTest02_04d, dataTest03_04d, dataTest04_04d, dataTest05_04d)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_04d)
    demoEnLot(listDataTests_04d)
}