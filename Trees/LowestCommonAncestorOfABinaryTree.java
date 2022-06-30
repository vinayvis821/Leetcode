// Difficulty: Easy
// Technique used: While loop, checking left and right children
// Runtime: O(h)


public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;
        while( current != null ) {
            if( p.val > current.val && q.val > current.val ) {
                current = current.right;
            } else if( p.val < current.val && q.val < current.val ) {
                current = current.left;
            } else {
                return current;
            }
        }
        return null;
    }
}
