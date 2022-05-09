import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val t  = sc.nextInt()

    for (i in 1..t) {
        val x = sc.nextInt()
        val y = sc.nextInt()
        val n = sc.nextInt()

        if ((n-(n%x)+y) <= n)
            println(n-(n%x)+y)
        else
            println(n-(n%x)-(x-y))
    }

}