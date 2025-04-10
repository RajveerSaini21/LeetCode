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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>(); 
        Stack<TreeNode> st = new Stack<>();

        if (root != null) {
            st.push(root);
        }
        
        while(!st.isEmpty()){
            TreeNode curr = st.peek(); 
            st.pop(); 

            result.add(curr.val);
            if(curr.right != null) st.push(curr.right) ;
            if(curr.left != null) st.push(curr.left) ; 
        }
        return result ; 
    }
}