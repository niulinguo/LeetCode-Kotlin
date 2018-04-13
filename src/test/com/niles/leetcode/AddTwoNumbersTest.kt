package test.com.niles.leetcode

import main.com.niles.leetcode.AddTwoNumbers
import main.com.niles.leetcode.ListNode
import kotlin.test.assertEquals
import kotlin.test.assertNull

fun main(args: Array<String>) {
    val addTwoNumbers = AddTwoNumbers()
    test1(addTwoNumbers)
    test2(addTwoNumbers)
    test3(addTwoNumbers)
}

fun test1(addTwoNumbers: AddTwoNumbers) {
    val ret = addTwoNumbers.addTwoNumbers(null, null)
    assertNull(ret)
}

fun test2(addTwoNumbers: AddTwoNumbers) {
    var ret = addTwoNumbers.addTwoNumbers(ListNode(5), ListNode(7))
    assertEquals(ret?.`val`, 2)
    ret = ret?.next
    assertEquals(ret?.`val`, 1)
}

fun test3(addTwoNumbers: AddTwoNumbers) {
    val l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next!!.next = ListNode(3)

    val l2 = ListNode(5)
    l2.next = ListNode(6)
    l2.next!!.next = ListNode(4)

    val ret = addTwoNumbers.addTwoNumbers(l1, l2)

    assertEquals(ret!!.`val`, 7)
    assertEquals(ret.next!!.`val`, 0)
    assertEquals(ret.next!!.next!!.`val`, 8)
}