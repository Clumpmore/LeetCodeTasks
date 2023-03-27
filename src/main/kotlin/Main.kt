fun main() {
    val haystack = "sadbadsad"
    val needle = "sad"
    val check = println(Solution().strStr(haystack, needle))
}

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        return if (needle==null) 0
        else haystack.indexOf(needle)
    }
}