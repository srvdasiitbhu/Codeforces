import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val k  = sc.nextInt()
    val l  = sc.nextInt()
    val m  = sc.nextInt()
    val n  = sc.nextInt()
    val d  = sc.nextInt()
    var c  = 0

    if (k==1 || l==1 || m==1 || n==1)
        print(d)
    else {
        for (i in 1..d) {
            if (i%k!=0 && i%l!=0 && i%m!=0 && i%n!=0)
                c++
        }
        print(d-c)
    }
}