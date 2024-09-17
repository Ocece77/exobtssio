fun canBeDivided(n:Int) :Unit{
    val diviseur = mutableListOf<Int>()
    val numbers = listOf(2 , 3 , 5 , 6)
    for (num in numbers){
        if (n%num == 0) {
            diviseur.add(num)
        }
    }
    diviseur.forEach{println("Divided by $it") }

}

fun main() {
    canBeDivided(10)
}