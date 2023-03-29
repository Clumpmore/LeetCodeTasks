fun main() {

}

fun climbStairs(n: Int): Int {
if(n<=3) return n
    var a =3
    var b=2
    for (i in 0 until n-3) {
        a+=b
        b= a-b
    }
    return a
}