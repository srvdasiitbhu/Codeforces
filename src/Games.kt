import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var c = 0

    val arr1 = Array<Int>(n){0}
    val arr2 = Array<Int>(n){0}

    for (i in 1..n) {
        val h = sc.nextInt()
        arr1[i-1] = h
        val a = sc.nextInt()
        arr2[i-1] = a
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (arr1[i] == arr2[j])
               c++
        }
    }
    print(c)
}