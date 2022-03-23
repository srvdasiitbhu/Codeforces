import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    var t: Int = 0
    val ar = Array<Int>(n){0}
    var count: Int = 0

    for (i in 0 until n) {
        var a = sc.nextInt()
        ar[i] = a
        if (i == k-1)
            t = ar[k-1]
    }

    for (i in 0 until n) {
        if (ar[i] > 0 && ar[i] >= t)
            count++
    }
    println(count)
}