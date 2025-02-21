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
class Solution {
public:
        void postorderT(TreeNode* root , vector<int> &arr){
        if(root == NULL) return ; 
        postorderT(root -> left , arr) ; 
        postorderT(root -> right , arr) ; 
        arr.push_back(root -> val) ; 
    }

    vector<int> postorderTraversal(TreeNode* root) {
        vector<int>arr ; 
        postorderT(root , arr) ; 
        return arr ; 
    }
};