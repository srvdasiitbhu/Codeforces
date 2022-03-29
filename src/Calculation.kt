import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n = sc.nextLong()
    val c: Long
    val o: Long
    val e: Long

    if (n%2 == 0L) {
        o = n / 2
        e = n / 2
    }
    else {
        o = (n / 2) + 1
        e = n / 2
    }
    c = (e*(e+1) - (o*o))
    print(c)
}