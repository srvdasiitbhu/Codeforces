import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    var y = sc.nextInt()

    while (true) {
        y+=1
        val a = y%10
        val b = (y/10)%10
        val c = (y/100)%10
        val d = (y/1000)%10

        if (a!=b && a!=c && a!= d && b!=c && b!=d && c!=d)
            break
    }
    print(y)
}