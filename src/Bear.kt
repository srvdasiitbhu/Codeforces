import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var count = 0

    if (a == b)
        print(1)
    else {
        while (a <= b) {
            a *= 3
            b *= 2
            count++
        }
        print(count)
    }
}