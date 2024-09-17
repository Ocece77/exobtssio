fun main() {
    println("The expression is -> a * 10.5 + b * 4.4 + (c + d) / 2.2 \nEnter the a :")
    var a = readln().toDouble()
    println("Enter the b :")
    var b = readln().toDouble()
    println("Enter the c :")
    var c = readln().toDouble()
    println("Enter the d :")
    var d = readln().toDouble()

    println(((a * 10.5) + (b * 4.4)+  (c + d) / 2.2))


}
