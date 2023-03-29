fun main() {
    println(mySqrt(5))
}

fun mySqrt(x: Int): Int {
    if (x<2) return x
    var left = 2
    var right = x/2
    while (left<=right) {
        var midd = left+(right-left)/2
        var squeareMidd:Long = midd.toLong()*midd.toLong()
        if (squeareMidd>x) right = midd-1
        else if (squeareMidd<x) left = midd+1
        else return midd
    }
return right
}
