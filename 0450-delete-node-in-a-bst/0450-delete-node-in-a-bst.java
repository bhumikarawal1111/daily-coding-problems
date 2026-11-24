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
    public TreeNode findIS(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        //1- find key
        if(root == null){
            return root;
        }
        if(key< root.val){
            root.left = deleteNode(root.left, key);
        }else if(key> root.val){
            root.right = deleteNode(root.right, key);
        }else{
            //0 child
            if(root.left == null && root.right == null){
                return null;
            }
            //1 child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                //2child
                //find Inorder successor
                //min val node(leftmost) in rightsubtree
                TreeNode IS = findIS(root.right);
                root.val = IS.val;
                root.right = deleteNode(root.right, IS.val);
            }  

        } 
        return root;
    }
}