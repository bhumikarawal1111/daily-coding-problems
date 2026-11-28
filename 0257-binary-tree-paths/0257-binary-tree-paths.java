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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) return ans;
        dfs(root, new StringBuilder(), ans);
        return ans;
    }

    private void dfs(TreeNode node, StringBuilder path, List<String> ans) {
        if (node == null) return;

        int len = path.length();
        path.append(node.val);

        if (node.left == null && node.right == null) {
            ans.add(path.toString());
        } else {
            if (node.left != null) {
                path.append("->");
                dfs(node.left, path, ans);
                path.setLength(len + String.valueOf(node.val).length());
            }
            if (node.right != null) {
                path.append("->");
                dfs(node.right, path, ans);
            }
        }

        path.setLength(len);
    }
}