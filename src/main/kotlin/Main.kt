import java.util.*

fun main() {

}

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p==null && q==null) return true
    var node1 = p
    var node2 = q
    if (node1!=null && node2!=null ) {
        return  (p!!.`val`==q!!.`val` && isSameTree(p.left,q.left) && isSameTree(p.right,q.right))
    }
    return false
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}