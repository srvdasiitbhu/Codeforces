import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n = sc.nextInt()
    var max: Int = 0
    var d: Int = 0

    for (i in 1..n) {
        var a = sc.nextInt()
        var b = sc.nextInt()
        d -= a
        d += b
        if (d>max)
            max=d
    }
    print(max)
}