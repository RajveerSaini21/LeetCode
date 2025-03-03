/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */




//JAVA
// class Solution {
//     public int maxPathSum(TreeNode root) {
//         int[] maxValue = new int[1]; 
//         maxValue[0] = Integer.MIN_VALUE ; 
//         maxPathDown(root , maxValue) ; 
//         return maxValue[0] ;

//     }

//     public int maxPathDown(TreeNode node , int[] maxValue){
//         if(node == null) return 0 ; 

//         int left = Math.max(0 , maxPathDown(node.left, maxValue));
//         int right = Math.max(0 , maxPathDown(node.right, maxValue));

//         maxValue[0] = Math.max( maxValue[0] ,right + left + node.val);
//         return Math.max(left , right) + node.val;

//     }
// }



// C++
class Solution {
public:
    int maxPathSum(TreeNode* root) {
        int maxValue = INT_MIN ; 
        maxPathDown(root , maxValue) ; 
        return maxValue; 
    }

    int maxPathDown(TreeNode* root , int &maxValue){
        if(root == nullptr) return 0 ; 

        int left = max(0 , maxPathDown(root->left , maxValue)) ; 
        int right = max(0 , maxPathDown(root -> right , maxValue)) ;

        maxValue = max(maxValue , left+right+root->val) ; 

        return max(left, right) + root->val ;  
    }
};