package _10_Demos_et_tests

/*
* Ce fichier contient les fonctions et classes nécessaires pour procéder aux tests
* par assertions des différentes fonctions des exercices et de générer des exemples
* illustrant le traitement attendu.
* */

/**
 * Fonction qui va tout simplement prendre en argument une liste d'objets
 * DataTest et pour chaque objet exécuter la méthode test().
 */
fun testerEnLot(dataTestList: List<DataTest>) {
    for (dataTest in dataTestList) {
        dataTest.test()
    }
}

/**
 * Fonction qui comme la fonction testerEnlot() va exécuter la méthode demo()
 * sur les objets de type DataTest contenu dans la liste donnée en argument.
 * La fonction génère également dans la console un titre numéroté pour chaque
 * objet DataTest.
 */
fun demoEnLot(dataTestList: List<DataTest>) {
    for ((i, dataTest) in dataTestList.withIndex()) {
        println("\nEXEMPLE ${i + 1} :\n-----------")
        dataTest.demo()
    }
}

/**
 * Interface présentant les méthodes test() et demo()
 * qui seront implémentées par chaque classe de test.
 * L'intérêt principal de cette interface est qu'elle
 * permet l'exécution des méthodes test() et demo()
 * par les fonctions testEnLot() et demoEnLot() pour
 * tous les différents de classes de test héritant
 * de l'interface DataTest.
 */
interface DataTest {
    fun test()
    fun demo()
}


class DataTestChercherLeMax(
    val fctTest: (List<Int>) -> List<Int>,
    val valList: List<Int>,
    val result: List<Int>
): DataTest {

    override fun test() {
        assert(fctTest(valList) == result) {
            "Le résultat attendu était ${result} pour ${valList}"
        }
    }

    override fun demo() {
        val result = fctTest(valList)
        println("Liste donnée : ${valList}\nValeur maxi : ${result[0]}\nIndice : ${result[1]}")
    }
}


/**
 * Classe permettant de réaliser des tests sur les fonctions :
 * trouverValeurPremier(Int, List<Int>): Int
 * trouverValeurDernier(Int, List<Int>): Int
 * nombreOccurrences(Int, List<Int>): Int
 * rechercheDicho(Int, List<Int>): Int
 */
class DataTestIntListInt(
    val fctTest: (Int, List<Int>) -> Int,
    val valTest: Int,
    val valList: List<Int>,
    val result: Int

): DataTest {
    override fun test() {
        assert(fctTest(valTest, valList) == result) {
            "Le résultat attendu était ${result}" +
                    " pour ${valTest} avec ${valList}"
        }
    }

    override fun demo() {
        val result = fctTest(valTest, valList)
        println("La valeur ${valTest} avec ${valList}\nDonne en résultat : ${result}")
    }
}


class DataTestMoyennePonderee(
    val fctTest: (List<List<Number>>) -> Double,
    val valList: List<List<Number>>,
    val result: Double
): DataTest {
    override fun test() {
        assert(fctTest(valList) == result) {
            "Le résultat attendu était ${result} pour ${valList}"
        }
    }

    override fun demo() {
        val result = fctTest(valList)
        println("La liste ${valList} a pour moyenne : ${result}")
    }


}

/**
 * Classe permettant de réaliser des tests sur les fonctions :
 * triParSelection(List<Int>): MutableList<Int>
 * supprimerDoublons(List<Int>): MutableList<Int>
 * inverserListe(List<Int>): MutableList<Int>
 * zeroGaucheUnDroit(List<Int>): MutableList<Int> *
 * */
class DataTestListList(
    val fctTest: (List<Int>) -> MutableList<Int>,
    val inputList: List<Int>,
    val ouputList: MutableList<Int>
): DataTest {
    override fun test() {
        assert(fctTest(inputList) == ouputList) {
            "Le résultat attendu était ${ouputList} pour ${inputList}"
        }
    }

    override fun demo() {
        val result = fctTest(inputList)
        println("La liste ${inputList}\ndevient  ${ouputList}")
    }
}

class DataTestMapDesOccurrences(
    val fctTest: (List<Int>) -> Map<Int, Int>,
    val valList: List<Int>,
    val result: Map<Int, Int>
): DataTest {
    override fun test() {
        assert(fctTest(valList) == result) {
            "Le résultat attendu était ${result} pour ${valList}"
        }
    }
    override fun demo() {
        val result = fctTest(valList)
        println("La liste ${valList}\ndonne ->  ${result}")
    }
}


class DataTestAlgoGlouton(
    val fctTest: (Double, List<Double>) -> Map<Double, Int>,
    val somme: Double,
    val pieces: List<Double>,
    val rendu: Map<Double, Int>
): DataTest {
    override fun test() {
        assert(fctTest(somme, pieces) == rendu) {
            "Le résultat attendu était ${rendu} pour ${somme}"
        }

    }
    override fun demo() {
        val result = fctTest(somme, pieces)
        println("Le rendu de somme ${somme}\ndonne ->  ${result}")
    }
}


class DataTestChiffrerCesar(
    val fctTest: (Int, String,) -> String,
    val cle: Int,
    val message: String,
    val messageChiffre: String
): DataTest {
    override fun test() {
        assert(fctTest(cle, message) == messageChiffre) {
            "Le résultat attendu était ${messageChiffre} pour ${message}"
        }
    }
    override fun demo() {
        val result = fctTest(cle, message)
        println("Le message ${message}\nDevient : ${messageChiffre}")
    }
}


class DataTestEstPalindrome(
    val fctTest: (String,) -> Boolean,
    val texte: String,
    val result: Boolean
): DataTest {
    override fun test() {
        assert(fctTest(texte) == result) {
            "Le résultat attendu était ${result} pour ${texte}"
        }
    }

    override fun demo() {
        val result = fctTest(texte)
        println("Le texte : ${texte}\nEst un palindrome ? : ${result}")
    }
}

class DataTestTrouverGene(
    val fctTest: (String, String) -> Boolean,
    val gene: String,
    val seqADN: String,
    val result: Boolean
): DataTest {
    override fun test() {
        assert(fctTest(gene, seqADN) == result) {
            "Le résultat attendu était ${result} pour le gène ${gene} dans la séquence ${seqADN}"
        }
    }
    override fun demo() {
        val result = fctTest(gene, seqADN)
        println("Le gène : ${gene}\nEst présent ? : ${result}\nDans la séquence : ${seqADN}")
    }
}

