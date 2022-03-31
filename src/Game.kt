import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val n  = sc.nextInt()
    val p  = sc.nextInt()
    val arr1 = Array<Int>(p){0}

    for (i in 0 until p) {
        val a = sc.nextInt()
        arr1[i] = a
    }

    val q = sc.nextInt()
    val arr2 = Array<Int>(q){0}

    for (i in 0 until q) {
        val b = sc.nextInt()
        arr2[i] = b
    }
    val arr = Array<Int>(p+q){0}
    for (i in 0 until p) {
        arr[i] = arr1[i]
    }
    for (i in 0 until q) {
        arr[p+i] = arr2[i]
    }

    var c = 0
    for (i in 1..n) {
        for (j in 0 until p+q) {
            if (i == arr[j]) {
                c++
                break
            }
        }
    }
    if (c == n)
        print("I become the guy.")
    else
        print("Oh, my keyboard!")


}