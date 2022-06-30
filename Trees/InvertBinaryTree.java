// Difficulty: Easy
// Technique used: Switch left and right children and recurse
// Runtime: O(h^2)?
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if( root == null ) {
            return null;
        }
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
