import java.util.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val x1 = sc.nextInt()
    val x2 = sc.nextInt()
    val x3 = sc.nextInt()

    val max1 = max(x1, x2)
    val max  = max(max1, x3)
    val min1 = min(x1, x2)
    val min  = min(min1, x3)

    val m    = (x1+x2+x3)-(max+min)

    val dis = (max-m)+(m-min)
    print(dis)

}