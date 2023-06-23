@main def question_02: Unit =
    val a = 2
    val b = 3
    val c = 4
    val d = 5
    val k = 4.3f
    //val temp1 = -2 * (g - k) + c

    println(dec(b) * a + c * dec(d))
    println(inc(a))
    //println(temp1)
    val temp2 = inc(c)
    println(temp2)
    val temp3 = inc(c) * inc(a)
    println(temp3)

def inc(a: Double): Double = a + 1

def dec(a: Double): Double = a - 1