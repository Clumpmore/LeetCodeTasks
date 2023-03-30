import com.sun.source.tree.Tree
import java.util.ArrayList
import java.util.Stack

fun main() {

}

fun inorderTraversal(root: TreeNode?): List<Int> {
    var list = ArrayList<Int>()
    var stack = Stack<TreeNode>()
    if (root == null) return list
    var currentNode = root

    while (currentNode != null || !stack.isEmpty()) {
        while (currentNode != null) {
            stack.push(currentNode)
            currentNode = currentNode!!.left
        }
        list.add(stack.peek().`val`)
        currentNode = stack.pop().right
    }
    return list
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}