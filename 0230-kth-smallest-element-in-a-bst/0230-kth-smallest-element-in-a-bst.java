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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ; 
        dfs(root , k , pq) ; 
        return pq.peek(); 
    }

    public void dfs(TreeNode node , int k, PriorityQueue<Integer> pq){
        if(node == null) return ;
        pq.offer(node.val) ; 
        if(pq.size() > k){
            pq.poll(); 
        }

        dfs(node.left , k , pq) ; 
        dfs(node.right , k , pq) ; 
    }
}