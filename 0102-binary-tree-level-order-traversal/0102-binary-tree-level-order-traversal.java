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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<>() ; 
       Queue<TreeNode> q = new LinkedList<>(); 
       if(root != null) q.offer(root) ; 

        while(!q.isEmpty()){
            int n = q.size() ; 
            List<Integer> level = new ArrayList<>() ; 
            for(int i = 0 ; i < n ; i++){
                TreeNode c = q.poll() ; 
                level.add(c.val) ; 
                if(c.left != null) q.offer(c.left); 
                if(c.right != null) q.offer(c.right) ; 
            }
            result.add(level) ; 
        }
       return result ; 
    }
}