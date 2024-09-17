fun isPositive(n:Int) = if ( n < 0) "negative" else if (n> 0) "positive" else "zero"
fun main() {
    println(isPositive(0))
}