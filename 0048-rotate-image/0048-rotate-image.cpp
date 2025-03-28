class Solution {
public:
    void rotate(vector<vector<int>>& arr) {
        int n = arr.size();  
        for(int i = 0 ; i < n ; i++){
            for(int j = n-1 ; j >= i ; j--){
                swap(arr[i][j] , arr[j][i]); 
            }
        }
        for(int i = 0 ; i < n; i++){
            reverse(arr[i].begin() , arr[i].end());
        }
    }
};