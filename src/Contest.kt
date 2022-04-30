import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n  = sc.nextInt()
    val ar = Array(n){0}

    for (i in 0 until n) {
        val k = sc.nextInt()
        ar[i] = k
    }
    var max = ar[0]
    var min = ar[0]
    var c   = 0
    for (i in 1 until n) {
        if (ar[i] > max){
            c++
            max = ar[i]
        }
        else if (ar[i] < min){
            c++
            min = ar[i]
        }
    }
    print(c)

}