fun main() {
    val userInput = println("Choose 1 or 0 : ")
    val n = readln().lowercase()
    print(if (n == "1" || n == "true") true else false)
}