import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n  = sc.nextInt()
    var k  = sc.nextInt()

    val time1: Int = (n)*(10 + (n-1)*5)
    val time = time1/2
    val left = 240 - time

        if (left >= k)
            print(n)
    else {
        val last = 5 + ((n-1)*5)
        var c = 0
            for (i in last downTo 5 step 5) {
                k -= i
                c++
                if (k <= left)
                    break
            }
            print(n-c)
        }
}