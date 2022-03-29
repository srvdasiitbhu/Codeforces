import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val a1 = sc.nextInt()
    val a2 = sc.nextInt()
    val a3 = sc.nextInt()
    val a4 = sc.nextInt()
    var c = 0

    val arr = arrayOf(a1, a2, a3, a4)

    for (i in 0..2) {
        for (j in i+1..3) {
            if (arr[i] == arr[j])
                c++
        }
    }
    if (c==3)
        print(c-1)
    else
        if (c==6)
            print(c-3)
    else
        print(c)
   }