import kotlin.math.sqrt

fun main(){

    zweineun()


}

fun zweizehn(){
    for(n in 1..100000){
        val first = (n-1)*(n-1)*(n-1)
        val second = n*n*n
        val third = (n+1)*(n+1)*(n+1)

        var result = first + second + third
        val resultm = sqrt(result.toDouble())

        if(!(hatNachkommastellen(resultm))) {

            println(n)
        }
    }
}

fun hatNachkommastellen(zahl: Double): Boolean {
    return zahl != kotlin.math.floor(zahl)
}

fun zweineun(){
    var z = 1

    for(i in 26..74) {
        var top = sqrt((75 - i).toDouble())
        var bottom = sqrt((i-25).toDouble())

        var result = top/bottom

        if(!hatNachkommastellen(result)){
            println(i)
        }

        val top2 = 75-i
        val bottom2 = i-75
        val abcd = top2/bottom2
        val result2 = sqrt(abcd.toDouble())
        if(!hatNachkommastellen(result2)){
            println("test $result2")
        }
    }
}

fun zweivier(){
    var sum = 0.0
    for(i in 1..2025){
        var test = sqrt(i.toDouble())
        var test1 = sqrt((i+1).toDouble())
        val value = test+test1
        sum += (1/value)

    }

    println(sum)
}

fun elfeinsfünf(){
    var lst = arrayOf(1,2,3,4,5,6)
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
    println(solution)
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

