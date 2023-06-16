@main def main: Unit =
    val k, i, j = 2
    val m, n = 5
    val f = 12.0f
    val g = 4.0f
    val c = 'X'

    val q_a = add(k, mul(12, m))
    println(s"Question a = $q_a")

    val q_b = div(m, j)
    println(s"Question b = $q_b")
    
    val q_c = rem(n, j)
    println(s"Question c = $q_c")
    
    val q_d = mul(div(m, j), j)
    println(s"Question d = $q_d")
    
    val q_e = add(f, add(mul(10, 5), g))
    println(s"Question e = $q_e")
    
    val q_f = mul(inc(i), n)
    println(s"Question a = $q_a")

def add(a: Double, b: Double): Double = a+b

def sub(a: Double, b: Double): Double = a-b

def div(a: Double, b: Double): Double = a/b

def mul(a: Double, b: Double): Double = a*b

def rem(a: Double, b: Double): Double = a%b

def inc(a: Double): Double = a + 1