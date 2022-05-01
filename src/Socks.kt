import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val a  = sc.nextInt()
    val b  = sc.nextInt()
    var max: Int

    if (a > b) {
        print(b)
        max = a-b
    }
    else {
        print(a)
        max = b-a
    }
    print(' ')
    print(max/2)
}