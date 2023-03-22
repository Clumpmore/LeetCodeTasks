fun main() {
    val nums1 = intArrayOf(2, 7, 11, 15)
    val nums2 = intArrayOf(3, 3, 4)
    val nums3 = intArrayOf(3, 3)
    val target1 = 9
    val target2 = 6
    val target3 = 6
    val twoSum1 = twoSum(nums1, target1)
    val twoSum2 = twoSum(nums2, target2)
    val twoSum3 = twoSum(nums3, target3)
    println(twoSum1)
    println(twoSum2)
    println(twoSum3)
}

fun twoSum(nums: IntArray, target: Int): ArrayList<Int> {
    val list = arrayListOf<Int>()
    var checkSolution = false
    for (i in 0 until nums.size - 1) {

        for (j in 1 until nums.size) {
            if (i != j) {
                if (nums[i] + nums[j] == target) {
                    list.add(i)
                    list.add(j)
                    checkSolution = true
                    break
                }
            }
        }
        if (checkSolution) break
    }
    if (list.size == 0) {
        list.add(1)
        list.add(2)
    }
    return list
}

