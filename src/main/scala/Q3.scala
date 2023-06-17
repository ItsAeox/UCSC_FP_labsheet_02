@main def question_03: Unit =
    val n_h = 40
    val ot_h = 30
    println(tax(sal(normal(n_h), over(ot_h))))

def tax(a:Double): Double = a * 0.88

def normal(b:Double): Double =
    val n_rate = 250
    b * n_rate

def over(c:Double): Double = 
    val ot = 85
    c * ot

def sal(ot:Double, n:Double) = ot + n
