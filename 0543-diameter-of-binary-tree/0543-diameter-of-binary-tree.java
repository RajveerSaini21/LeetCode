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
    int d = -999999; 
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root) ; 
        return d ; 
    }

    public int solve(TreeNode root){
        if(root == null) return 0 ; 
        int lh = solve(root.left) ; 
        int rh = solve(root.right) ;
        d = Math.max(d , lh+rh) ; 
        return Math.max(lh , rh) + 1 ; 
    } 
}