import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n = sc.nextInt()
    val h = sc.nextInt()
    var c = 0

    for (i in 1..n) {
        val a = sc.nextInt()
        if (a>h)
            c+=2
        else
            c++
    }
    print(c)
}