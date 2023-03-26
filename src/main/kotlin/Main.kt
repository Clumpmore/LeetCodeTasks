import java.util.*

fun main() {

}

class Solution {
    fun isValid(s: String): Boolean {
        val leftSymbols = Stack<Char>()
        for (c in s.toCharArray()) {
            if (c  == '(' || c == '{'||c =='[') {
                leftSymbols.push(c)
            }
            else if (c == ')'&& !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop()
            } else if (c == '}'&& !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop()
            } else if (c == ']'&& !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop()
            }
            else {
                return false
            }
        }
        return leftSymbols.isEmpty()
    }
}



