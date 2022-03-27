import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    var n = sc.nextInt()
    var k = sc.nextInt()
    var r: Int

    while (k != 0) {
        r = n%10
        if (r!=0)
            n -= 1
        else
            n /= 10
        k--
    }
    print(n)
}