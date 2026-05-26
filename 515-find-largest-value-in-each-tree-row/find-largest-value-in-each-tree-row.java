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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        List<Integer> ans  = new ArrayList<>();
        while(!que.isEmpty()){
           int length = que.size();
           int maxvalue = Integer.MIN_VALUE;

           for(int i=0 ; i < length ; i++){
             TreeNode node = que.remove();
             maxvalue = Math.max(maxvalue,node.val);

             if(node.left!=null){
                que.add(node.left);
             }
             if(node.right!=null){
                que.add(node.right);
             }
           }
          ans.add(maxvalue);
        }
        return ans;
    }
}