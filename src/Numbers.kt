import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner (System.`in`)
    val a  = sc.nextInt()
    val b  = sc.nextInt()
    val c  = sc.nextInt()
    val d  = sc.nextInt()

    var x1: Double = 0.0
    var x2: Double = 0.0
    var x3: Double = 0.0

    var y1: Double = 0.0
    var y2: Double = 0.0
    var y3: Double = 0.0

    var z1: Double = 0.0
    var z2: Double = 0.0
    var z3: Double = 0.0

    var p1: Double = 0.0
    var p2: Double = 0.0
    var p3: Double = 0.0

    //a,b,c
     x1 = (((a+b)-c).toDouble()/2.0)
     x2 = (((a+c)-b).toDouble()/2.0)
     x3 = (((b+c)-a).toDouble()/2.0)

    //a,c,d
    y1 = (((a+d)-c).toDouble()/2.0)
    y2 = (((a+c)-d).toDouble()/2.0)
    y3 = (((d+c)-a).toDouble()/2.0)

    //c,d,b
    z1 = (((d+b)-c).toDouble()/2.0)
    z2 = (((d+c)-b).toDouble()/2.0)
    z3 = (((b+c)-d).toDouble()/2.0)

    //a,b,d
    p1 = (((a+b)-d).toDouble()/2.0)
    p2 = (((a+d)-b).toDouble()/2.0)
    p3 = (((b+d)-a).toDouble()/2.0)


    if ((x1+x2+x3) == d.toDouble()) {
        print(x1.toInt())
        print(" ")
        print(x2.toInt())
        print(" ")
        print(x3.toInt())
    }
    else if ((y1+y2+y3) == b.toDouble()) {
        print(y1.toInt())
        print(" ")
        print(y2.toInt())
        print(" ")
        print(y3.toInt())
    }
    else if((z1+z2+z3) == a.toDouble()) {
        print(z1.toInt())
        print(" ")
        print(z2.toInt())
        print(" ")
        print(z3.toInt())
    }
    else {
        print(p1.toInt())
        print(" ")
        print(p2.toInt())
        print(" ")
        print(p3.toInt())
    }

}