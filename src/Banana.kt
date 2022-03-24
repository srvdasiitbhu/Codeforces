import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val k = sc.nextInt()
    val n = sc.nextInt()
    val w = sc.nextInt()
    var t: Int = 0

    for (i in 1..w) {
        t += (k * i)
    }
    if (n < t)
        print(t-n)
    else
        print(0)
}