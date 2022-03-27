import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val x = sc.nextInt()

    val d = x/5
    val r = x%5

    if (r == 0)
        print(d)
    else
        print(d+1)
}