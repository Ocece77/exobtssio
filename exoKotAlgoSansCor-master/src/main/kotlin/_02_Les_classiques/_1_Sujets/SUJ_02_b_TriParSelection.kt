package _02_Les_classiques._1_Sujets

import _10_Demos_et_tests.DataTestListList
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot

/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * La fonction prend en argument une liste d'entiers (en désordre)
 * La fonction copie la liste et applique un tri par sélection sur la copie
 * et la retourne.
 * @param liste Liste d'entiers (Int)
 * @return Une copie de la liste donnée en argument avec les valeurs triées en ordre croissant.
 */

fun triParSelection(liste: List<Int>): MutableList<Int> {
    // Copie de la liste :
    val listeCopie = liste.toMutableList();
    var min = liste[0];



    // Algorithme de tri :

    for (i in 0..liste.lastIndex ) { //de 0 aux dernier index pax exemple liste.size = 6 alors de 0 à 5
        for (j in listeCopie.subList(i, liste.size)) { // on crée des sub list pour prendre les elements non traités
            if (j < min){ // si l'element qu'on vérifie et inférieur au current min alors il devient le minimum
                min = j
            }
        }
        listeCopie.remove(min) //on enlève le min
        listeCopie.add(i, min) // puis on le place à l'index i pourqu'il suive l'ordre
        min = if (i == liste.size -1 ) listeCopie[listeCopie.lastIndex] else listeCopie.subList(i+1, liste.size)[0] // c'est compliqué mais si on atteint la fin de la liste le minimum devient le seul chfifre restant



    }


    return listeCopie
}


/* -------------------
    Données de test
   --------------------*/

val dataTest01_02b = DataTestListList(::triParSelection, listOf(11, 3, 5, 8, 7, 2), mutableListOf(2, 3, 5, 7, 8, 11))
val dataTest02_02b = DataTestListList(::triParSelection, listOf(15, -5, 13, 9, 8, 7), mutableListOf(-5, 7, 8, 9, 13, 15))
val listDataTests_02b = listOf(dataTest01_02b , dataTest02_02b)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_02b)
    demoEnLot(listDataTests_02b)
}