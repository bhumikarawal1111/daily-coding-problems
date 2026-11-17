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
    static class Info{
        int d;
        int h;
        Info(int d, int h){
            this.d = d;
            this.h = h;
        }
    }
    public Info helper(TreeNode root){
        if(root == null){
            return new Info(0,0);
        }
        Info lInfo = helper(root.left);
        Info rInfo = helper(root.right);
        int selfDia = lInfo.h + rInfo.h;
        int dia = Math.max(selfDia, Math.max(lInfo.d, rInfo.d));

        int h = Math.max(lInfo.h , rInfo.h)+1;

        return new Info(dia, h);
    }
    public int diameterOfBinaryTree(TreeNode root) {
       return helper(root).d;
    }
}