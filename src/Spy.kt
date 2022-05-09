import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val t  = sc.nextInt()

    for (i in 1..t) {
        val n = sc.nextInt()
        val ar = Array<Int>(n){0}
        for (j in 0 until n) {
            ar[j] = sc.nextInt()
        }
        for (j in 0 until n) {
            if (ar[j] != ar[j+1] && ar[j+1] != ar[j+2]) {
                println(j+2)
                break
            }
            if (ar[j] == ar[j+1] && ar[j+1] != ar[j+2]) {
                println(j+3)
                break
            }
            if (ar[j] != ar[j+1] && ar[j+1] == ar[j+2]) {
                println(j+1)
                break
            }
        }
    }
}