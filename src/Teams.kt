import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n  = sc.nextInt()
    val k  = sc.nextInt()
    val ar = Array<Int>(n){0}
    var c  = 0

    for (i in 0 until n) {
        ar[i] = sc.nextInt()
        if (5-ar[i] >= k)
            c++
    }
    if (c>=3) {
        val q = c/3
        print(q)
    }
    else
        print(0)
}