package test.com.niles.leetcode

import main.com.niles.leetcode.TwoSum
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

fun main(args: Array<String>) {
    val twoSum = TwoSum()
    test1(twoSum)
    test2(twoSum)
    test3(twoSum)
}

fun test1(twoSum: TwoSum) {
    val target = 9
    val nums = intArrayOf(2, 7, 11, 15)
    val ret = twoSum.twoSum(nums, target)
    assertEquals(target, nums[ret[0]] + nums[ret[1]])
    assertNotEquals(ret[0], ret[1])
}

fun test2(twoSum: TwoSum) {
    val target = 100
    val nums = intArrayOf(2, 7, 11, 15)
    val ret = twoSum.twoSum(nums, target)
    assertEquals(0, ret.size)
}

fun test3(twoSum: TwoSum) {
    val target = 6
    val nums = intArrayOf(3, 2, 4)
    val ret = twoSum.twoSum(nums, target)
    assertEquals(target, nums[ret[0]] + nums[ret[1]])
    assertNotEquals(ret[0], ret[1])
}