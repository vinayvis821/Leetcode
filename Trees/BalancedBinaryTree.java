// Difficulty: Easy
// Technique used: DFS on left and right children
// Runtime: O(h^2)?
public class BalancedBinaryTree {
    public boolean result = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return result;
        
    }
    
    public int dfs( TreeNode root ) {
        if( root == null ) {
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftDepth = dfs(left);
        int rightDepth = dfs(right);
        if( Math.abs(leftDepth - rightDepth) > 1) {
            result = false;
        }
        return 1 + Math.max(leftDepth,rightDepth);
    }
}
