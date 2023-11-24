import kotlin.math.sqrt

fun main(){
    /*var lst = arrayOf(1,2,3,4,5,6)
    var solution: Int = 0

    val range = (111111..666666)
    val gefilterteZahlen = range.filter { zahl ->
        !zahl.toString().any { it in setOf('7', '8', '9', '0') }
    }

    for(i in gefilterteZahlen) {
        if (berechneQuersumme(i) == 21) {
            solution++
        }
    }
    println(solution)*/

    var sum = 0.0
    for(i in 1..2025){
        var test = sqrt(i.toDouble())
        var test1 = sqrt((i+1).toDouble())
        val value = test+test1
        sum += (1/value)

    }

    println(sum)


}


fun berechneQuersumme(zahl: Int): Int {
    var quersumme = 0
    var rest = zahl

    while (rest > 0) {
        quersumme += rest % 10
        rest /= 10
    }

    return quersumme
}

