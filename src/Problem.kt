import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n = sc.nextInt()
    var c=0

    for (i in 1..n) {
        val a = sc.nextInt()
        if (a==1)
            c+=1
    }
    if (c==0)
        print("EASY")
    else
        print("HARD")
}