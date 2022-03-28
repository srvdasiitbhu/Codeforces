import java.util.*

fun main(args: Array<String>) {

    val sc  = Scanner (System.`in`)
    val n   = sc.nextInt()
    val arr = Array<Int>(n){0}
    var c   = 1

    for (i in 0 until n) {
        val a = sc.nextInt()
        arr[i] = a
    }
    for (i in 0..n-2) {
        if (arr[i] != arr[i+1])
            c++
    }
    print(c)
}