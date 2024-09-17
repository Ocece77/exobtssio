fun enoughSleep(a :Int, b:Int, h : Int) :String{
    var r = ""
    when (h){
        in (a..b) -> r ="normal"
        in (0.. a )->r = "Deficiency"
        else ->r = "Excess"
     }
    return r

}

fun main() {
    println(enoughSleep(7 ,9 ,2))
}
