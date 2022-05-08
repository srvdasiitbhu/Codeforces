import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n  = sc.nextInt()
    val ar = Array<Int>(n){0}
    var m  = 0
    var s  = 0

    for (i in 0 until n) {
        ar[i] = sc.nextInt()
        if (ar[i] > m)
            m = ar[i]
    }

    for (i in 0 until n) {
        val r = m - ar[i]
        s+=r
    }
    print(s)
}