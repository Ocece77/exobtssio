fun main() {
    println("Enter three boolean ( false or true ) : ")
    val invit = readLine()!!.split(" ").map{it.toBoolean()} // read other value in the same way
    println( ((invit[0] xor invit[1]) || invit[2]) )
}

