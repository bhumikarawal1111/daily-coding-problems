/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean helper(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left == right;
        }
        if(left.val != right.val){
            return false;
        }
        //if values are not null and equal then check left tree and right tree
        boolean leftRight = helper(left.left, right.right);
        boolean rightLeft = helper(left.right, right.left);

        return leftRight && rightLeft;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return false;
        }
        return helper(root.left, root.right);
    }
}