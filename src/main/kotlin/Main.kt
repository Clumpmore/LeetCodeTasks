fun main() {
    val s ="a "
    println(s.length-1)
println(Solution().lengthOfLastWord(s))
}

class Solution {
    fun lengthOfLastWord(s: String): Int {
       var count = 0
        var copy = s.trim()
        var start = copy.length-1
        for (i in start.downTo(0)) {
            if (copy[i]==' ') {
                break
            }
            count++
        }
        return count
    }
}
