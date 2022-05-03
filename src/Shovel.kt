import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val k  = sc.nextInt()
    val r  = sc.nextInt()
    var c  = 0
    var i  = 1
        while (true) {
            val t = i * k
            val rem = t % 10
            if (rem == r || rem == 0 || t == r) {
                c = i
                break
            }
            i++
        }
    print(c)
}