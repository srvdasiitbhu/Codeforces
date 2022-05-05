import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val t  = sc.nextInt()

    for (i in 1..t) {
        val a = sc.nextInt()
        val b = sc.nextInt()

        if (a > b) {
            val left = a - b
            val q    = left/10
            val rem  = left%10
            if (rem != 0)
                println(q+1)
            else
                println(q)
        }
        else
            if (a < b) {
                val left = b - a
                val q    = left/10
                val rem  = left%10
                if (rem != 0)
                    println(q+1)
                else
                    println(q)
            }
        else{
            println(0)
            }
    }
}