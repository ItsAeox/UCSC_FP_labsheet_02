@main def question_04: Unit =
    check(40, 20)


def tot_inc(price:Double, num:Int):Double = 
    val tot = price*num - (500 + 3*num)
    println(s"Price : $price \t Profit : $tot\n")
    0

def check(price:Double, num:Int):Double = 
    if(price > 5 ){
        check(price-5, num+20)
        tot_inc(price, num)
    }
    else{
        return 0
    }


