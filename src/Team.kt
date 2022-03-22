import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n : Int = sc.nextInt()
    var count: Int = 0

    for (i  in 1..n) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.nextInt()


        if (a==1 && b==1 && c==1)
            count++
        else
            if (a==1 && b==1)
                count++
        else
            if (a==1 && c==1)
                count++
        else
            if (b==1 && c==1)
                count++
    }
    println(count)
}