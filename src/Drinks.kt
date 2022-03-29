import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n = sc.nextInt()
    var s=0

    for (i in 1..n) {
        val p = sc.nextInt()
        s+=p
    }
    print(s/(n*100).toDouble()*100)
}