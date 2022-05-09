import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n  = sc.nextInt()
    var m_count = 0
    var c_count =0

    for (i in 1..n) {
        val m = sc.nextInt()
        val c = sc.nextInt()
        if (m > c)
            m_count++
        else if (m < c)
            c_count++
    }
    if (m_count > c_count)
        print("Mishka")
    else if (m_count < c_count)
        print("Chris")
    else
        print("Friendship is magic!^^")
}