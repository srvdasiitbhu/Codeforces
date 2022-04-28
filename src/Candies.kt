import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val t  = sc.nextInt()

    for (i in 1..t) {
        val n = sc.nextInt()

        if (n == 1 || n == 2)
            println(0)
        else
            if (n%2 == 0)
                println((n/2)-1)
        else
            println(n/2)
    }
}