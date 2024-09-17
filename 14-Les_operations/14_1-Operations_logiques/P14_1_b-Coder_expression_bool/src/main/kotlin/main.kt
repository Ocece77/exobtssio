import java.util.*

fun main() {
    println("Do you have the invitation ? (true /false ) :")
  var a = readln().lowercase().toBoolean()

    println("Do you have a gift ? (true /false ) :")
    var b = readln().lowercase().toBoolean()

    var isAllowed = if (a && b) true else false
    var response =  if (isAllowed)  "Welcome to the party bro !!" else "You ain't allowed in loseerr :c"
    println(isAllowed  )
    println(response)
}

