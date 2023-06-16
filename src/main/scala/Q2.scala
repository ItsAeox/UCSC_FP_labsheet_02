@main def question_02: Unit =
    val a = 2
    val b = 3
    val c = 4
    val d = 5
    val k = 4.3f

    println(dec(b) * a + c * dec(d))
    println(inc(a))
    //println(-2 * (g - k) + c)
    println(c=inc(c))
    println(c=inc(c) * inc(a))

def inc(a: Double): Double = a + 1

def dec(a: Double): Double = a - 1