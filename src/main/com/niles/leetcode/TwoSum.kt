package main.com.niles.leetcode

/**
 * https://leetcode.com/problems/two-sum/description/
 */
class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in 0 until nums.size) {
            val index = map[target - nums[i]]
            if (index != null) {
                return intArrayOf(index, i)
            } else {
                map.put(nums[i], i)
            }
        }
        return intArrayOf()
    }

}