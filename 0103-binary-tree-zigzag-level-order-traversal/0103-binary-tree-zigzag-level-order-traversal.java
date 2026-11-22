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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); //offer = add
        int level = 0; //flag

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> levSublist = new LinkedList<>();
            while(size>0){
                //bfs
                TreeNode node = q.poll();//top node removed
                if(level % 2 != 0){ //odd lvl
                    //insertion at head ..3 then 2
                    levSublist.addFirst(node.val);
                }
                else{ //even
                    levSublist.addLast(node.val);
                }
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
                size--;

            }
            level++;
            ans.add(levSublist);

        }
        return ans;
    }
}