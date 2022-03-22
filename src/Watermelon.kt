import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val w  = sc.nextInt()
    val r = w%2


    if (r == 0 && w > 2)
        print("YES")
    else
        print("NO")
}