import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n  = sc.nextInt()
    val r  = n-4
    var f1 = 0
    var f2 = 0

    for (i in 4..n-5) {
        val s = n-i
        var c = 0
        for (j in 2 until i) {
            if (i%j == 0) {
                c++
                break
            }
        }
        var count = 0
        if (c > 0) {
            for (j in 2 until s) {
                if (s%j == 0) {
                    count++
                    break
                }
            }
        }
        if (count > 0) {
            f1 = i
            f2 = s
            break
        }
    }
    print(f1)
    print(" ")
    print(f2)
}