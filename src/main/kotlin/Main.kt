fun main() {

}

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val longestCommonPrefix = StringBuilder()
        if (strs.isEmpty()) {
            return longestCommonPrefix.toString()
        }
        var minimumLength = strs[0].length
        for (i in 1 until strs.size) {
            minimumLength = minimumLength.coerceAtMost(strs[i].length)
        }
        for (i in 0 until minimumLength) {
            val current = strs[0][i]
            for (str in strs) {
                if (str[i] != current) {
                    return longestCommonPrefix.toString()
                }
            }
            longestCommonPrefix.append(current)
        }
        return longestCommonPrefix.toString()
    }
}
