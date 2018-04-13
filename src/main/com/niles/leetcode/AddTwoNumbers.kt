package main.com.niles.leetcode

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 */
class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var carry = 0
        var ret: ListNode? = null
        var tmp: ListNode? = null
        var first = l1
        var second = l2
        while (first != null || second != null || carry != 0) {
            val sum = carry + (first?.`val` ?: 0) + (second?.`val` ?: 0)

            carry = sum / 10

            first = first?.next
            second = second?.next

            if (tmp == null) {
                tmp = ListNode(sum % 10)
                ret = tmp
            } else {
                tmp.next = ListNode(sum % 10)
                tmp = tmp.next
            }
        }
        return ret
    }
}

class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null
}