/**
 * Definition for a binary tree Root.
 * public class TreeRoot {
 *     int val;
 *     TreeRoot left;
 *     TreeRoot right;
 *     TreeRoot() {}
 *     TreeRoot(int val) { this.val = val; }
 *     TreeRoot(int val, TreeRoot left, TreeRoot right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot== null ){
            return true;
        }
        else if(root == null || subRoot == null || root.val != subRoot.val){
            return false;
        }
        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if (!isIdentical(root.right, subRoot.right)) {
            return false;
        }
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
            if(root.val == subRoot.val){
                if(isIdentical(root, subRoot)){
                    return true;
                }
            }//else find it in left or right subtree
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}