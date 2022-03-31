import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val t  = sc.nextInt()

    for (i in 1..t) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        if (a%b == 0)
            println(a%b)
        else
        if (a<b)
            println(b-a)
        else {
            val r = a % b
            println(b-r)
        }
    }
}