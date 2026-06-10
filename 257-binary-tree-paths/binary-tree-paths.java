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
        List<String> res = new ArrayList<>();
        if(root!=null){
            dfs(root,"",res);
        }
        return res;
        
    }
    private void dfs(TreeNode node , String path , List<String> ans){
        if(node == null) return;

        path += Integer.toString(node.val);

        if(node.left == null && node.right == null){
            ans.add(path);
        }
        else{
            path += "->";
            if(node.left!=null) dfs(node.left,path,ans);
            if(node.right!=null) dfs(node.right,path,ans);
        }
    }
}