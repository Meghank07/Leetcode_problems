/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        dfs(root, null, parentMap);
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        
        queue.offer(target);
        visited.add(target);
        
        int currentDistance = 0;
    
        while (!queue.isEmpty()) {
            if (currentDistance == k) {
                while (!queue.isEmpty()) {
                    ans.add(queue.poll().val);
                }
                return ans;
            }
            
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                
                if (current.left != null && !visited.contains(current.left)) {
                    visited.add(current.left);
                    queue.offer(current.left);
                }
                
                if (current.right != null && !visited.contains(current.right)) {
                    visited.add(current.right);
                    queue.offer(current.right);
                }
                
                TreeNode parent = parentMap.get(current);
                if (parent != null && !visited.contains(parent)) {
                    visited.add(parent);
                    queue.offer(parent);
                }
            }
            currentDistance++;
        }
        
        return ans;
    }
    private void dfs(TreeNode node, TreeNode parent, Map<TreeNode, TreeNode> parentMap) {
        if (node == null) return;
        
        if (parent != null) {
            parentMap.put(node, parent);
        }
        
        dfs(node.left, node, parentMap);
        dfs(node.right, node, parentMap);
    }
}