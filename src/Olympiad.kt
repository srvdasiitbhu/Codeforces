import java.util.*
import kotlin.math.min

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n  = sc.nextInt()
    val ar = Array<Int>(n){0}
    var p  = 0
    var m  = 0
    var e  = 0

    for (i in 0 until n) {
        ar[i] = sc.nextInt()
        if (ar[i] == 1)
            p++
        else
            if (ar[i] == 2)
                m++
        else
            e++
    }
    val min1 = min(p, m)
    val min  = min(min1, e)

    println(min)

    for (i in 1..min) {
        var p1  = 0
        var m1  = 0
        var e1  = 0
        for (j in 0 until n) {
            if (ar[j] == 1 && p1 == 0){
                ar[j] = 0
                p1++
                print(j+1)
                print(" ")
            }
             if (ar[j] == 2 && m1 == 0){
                ar[j] = 0
                m1++
                print(j+1)
                print(" ")
            }
             if (ar[j] == 3 && e1 == 0){
                ar[j] = 0
                e1++
                print(j+1)
                print(" ")
            }
            if (j == n-1)
              println()
        }
    }
}