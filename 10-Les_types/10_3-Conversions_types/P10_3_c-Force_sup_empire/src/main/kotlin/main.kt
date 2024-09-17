
fun main() {
    println("Enter the number of empire's ships : ")
    val empiresShip = readln().toDouble()
    println("Enter the number of rebel's ships : ")
    val alliancesShip = readln().toDouble()
    val ratioDouble: Double = empiresShip / alliancesShip
    val ratio = ratioDouble.toInt()
    println(ratio)
}