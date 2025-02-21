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
    // void preorderT(TreeNode* root , vector<int> &arr){
    //     if(root == NULL) return ; 

    //     arr.push_back(root -> val) ; 
    //     preorderT(root -> left , arr) ; 
    //     preorderT(root -> right , arr) ; 
    // }

    // vector<int> preorderTraversal(TreeNode* root) {
    //     vector<int>arr ; 
    //     preorderT(root , arr) ; 
    //     return arr ; 
    // }

    vector<int> preorderTraversal(TreeNode* root){
        vector<int> preorder ; 
        if(root == nullptr) return preorder ;

        stack<TreeNode*> st ; 
        st.push(root) ; 
        while(!st.empty()){
            root = st.top() ;
            st.pop() ; 
            preorder.push_back(root -> val) ; 

            if(root -> right != nullptr){
                st.push(root -> right) ; 
            }

            if(root -> left != nullptr){
                st.push(root -> left) ; 
            }
        }
        return preorder ;  
    }
};