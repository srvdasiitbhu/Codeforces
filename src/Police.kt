import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n  = sc.nextInt()
    val ar = Array<Int>(n){0}
    var count_neg = 0

    for (i in 0 until n) {
        ar[i] = sc.nextInt()
        if (ar[i] < 0)
            count_neg++
    }

    var a: Int = 0
    var b: Int = 0
    for (i in 0 until n) {
        if (ar[i]>0) {
            a = i
            break
        }
    }
    var j = a
    var count = 0
    while (j < n) {
        if (ar[j] > 0){
            b+=ar[j]
        }
        else if (ar[j] < 0 && b > 0){
            b+=ar[j]
            count++
        }
        j++
    }
    print(count_neg-count)
}