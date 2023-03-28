fun main() {

}

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        while (start <= end) {
            var mid = (start + end) / 2
            if (target > nums[mid]) start = mid + 1
            else if (target < nums[mid]) end = mid - 1
            else return mid
        }
        return start
    }
}


