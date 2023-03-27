fun main() {
val nums = intArrayOf(3,2,2,3)
    val check = Solution().removeElement(nums,2)
    println(check)
}
class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
var count = 0
        for (i in nums.indices) {
            if (nums[i]!=`val`) {
                nums[count++]=nums[i]

            }

        }
        return count
    }
}
