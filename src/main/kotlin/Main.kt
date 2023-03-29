fun main() {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        var h1 = head
        while (h1!!.next!=null) {
            if (h1.`val`==h1.next!!.`val`) {
                h1.next = h1.next!!.next
            } else {
                h1 = h1.next
            }
        }
        return head
    }
}


