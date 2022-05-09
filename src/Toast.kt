import java.util.*
import kotlin.math.min

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n  = sc.nextInt()
    val k  = sc.nextInt()
    val l  = sc.nextInt()
    val c  = sc.nextInt()
    val d  = sc.nextInt()
    val p  = sc.nextInt()
    val nl = sc.nextInt()
    val np = sc.nextInt()

    val td = k*l
    val tdt = td/nl
    val cdt = c*d
    val salt = p/np
    val x = tdt/n
    val y = cdt/n
    val z = salt/n
    val min1 = min(x, y)
    val min = min(min1, z)

    println(min)

}