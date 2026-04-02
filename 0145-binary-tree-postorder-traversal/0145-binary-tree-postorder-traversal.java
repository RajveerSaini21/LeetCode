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
// class Solution {
//     public static void postOrderT(TreeNode root , List<Integer> arr){
//         if(root == null) return ; 

//         postOrderT(root.left , arr) ; 
//         postOrderT(root.right , arr) ; 
//         arr.add(root.val) ; 
//     }
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> arr = new ArrayList<>(); 
//         postOrderT(root , arr) ; 
//         return arr ; 
//     }
// }

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            result.add(curr.val);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        Collections.reverse(result);
        return result;
    }
}