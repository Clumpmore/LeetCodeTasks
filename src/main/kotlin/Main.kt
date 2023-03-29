fun main() {
    var a = "100"
    var b = "101"
    var check = Solution().addBinary(a, b)
    println(check)
    println(a[2] - '0')
    println(b[2] - '0')
}

class Solution {
    fun addBinary(a: String, b: String): String = StringBuilder().apply {
        var o = 0
        var i = a.lastIndex
        var j = b.lastIndex
        while (i >= 0 || j >= 0 || o == 1) {
            var num = o
            o = 0
            if (i >= 0 && a[i--] == '1') num++
            if (j >= 0 && b[j--] == '1') num++
            when (num) {
                0 -> append('0')
                1 -> append('1')
                2 -> {
                    append('0')
                    o = 1
                }
                else -> {
                    append('1')
                    o = 1
                }
            }
        }
    }.reverse().toString()
}
}