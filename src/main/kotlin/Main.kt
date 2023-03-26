fun main() {

}

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var l1 = list1
        var l2 = list2
        if (l1 == null) {
            return l2
        }
        if (l2 == null) {
            return list1
        }
        val head:ListNode
        var temp:ListNode?
        if (l1.`val`<l2.`val`) {
            head = ListNode(l1.`val`)
            temp = head
            l1 = l1.next
        } else  {
            head = ListNode(l2.`val`)
            temp = head
            l2 = l2.next
        }
        while (l1 != null && l2!=null) {
            if (l1.`val`<l2.`val`) {
                temp!!.next = ListNode(l1.`val`)
                l1 = l1.next
            } else  {
                temp!!.next = ListNode(l2.`val`)
                l2 = l2.next
            }
            temp = temp.next
        }
        while (l1 != null) {
            temp!!.next = ListNode(l1.`val`)
            l1 = l1.next
            temp = temp.next
        }
        while (l2 != null) {
            temp!!.next = ListNode(l2.`val`)
            l2 = l2.next
            temp = temp.next
        }
        return head

    }
}
class ListNode(var `val`: Int) {
        var next: ListNode? = null
     }