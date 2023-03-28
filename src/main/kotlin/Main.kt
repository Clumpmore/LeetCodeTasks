fun main() {

}

class Solution {
    fun plusOne(digits: IntArray): IntArray {

        var i = digits.size - 1;

        while (i >= 0 && digits[i] == 9) {
            i--
        }


        if (i == -1) {
            var result = IntArray(digits.size + 1)
            result[0] = 1;
            return result;
        }
        var result = IntArray(digits.size)

        result[i] = digits[i] + 1;
        for (j in 0 until i) {
            result[j] = digits[j]
        }

        return result;
    }
}