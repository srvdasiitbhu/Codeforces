import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n = sc.nextInt()
    var c = 0

    for (i in 1..n) {
        val p = sc.nextInt()
        val q = sc.nextInt()
        if (q-p >= 2)
            c++
    }
    print(c)
}