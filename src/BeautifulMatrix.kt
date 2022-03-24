import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val arr = Array(5){Array(5){0}}
    var index1: Int = 0
    var index2: Int = 0

    for (i in 0..4) {
        for (j in 0..4) {
            arr[i][j] = sc.nextInt()
            if (arr[i][j] == 1) {
                index1 = abs(i-2)
                index2 = abs(j-2)
            }
        }
    }

    print(index1 + index2)
}