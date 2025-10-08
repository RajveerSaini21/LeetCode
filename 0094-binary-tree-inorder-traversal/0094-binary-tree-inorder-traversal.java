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
    public static void inorderTraversal(TreeNode root, List<Integer> arr){
        if(root == null) return ; 
        inorderTraversal(root.left , arr) ; 
        arr.add(root.val) ; 
        inorderTraversal(root.right , arr) ;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>(); 
        inorderTraversal(root , arr) ; 
        return arr ; 
    }
}