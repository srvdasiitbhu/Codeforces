import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n  = sc.nextInt()
    val m  = sc.nextInt()

    for (i in 1..n) {
        if (i%2 != 0) {
            for (i in 1..m)
                print('#')
            println()
        }
        else{
            if (i%2 == 0 && i%4 != 0) {
                for (j in 1 until m)
                    print('.')
                println('#')
            }
            else{
                print('#')
                for (j in 1 until m)
                    print('.')
                println()
            }
        }
    }
}