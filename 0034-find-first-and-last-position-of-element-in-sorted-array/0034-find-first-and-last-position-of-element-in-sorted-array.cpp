class Solution {
public:
    int lower_bound(vector<int> &arr , int n , int x){
        int low = 0 ;
        int high = n -1 ; 
        int ans = n ;
        while(low <= high){
            int mid = low+(high - low)/2; 
            if(arr[mid] >= x){
                ans = mid ; 
                high = mid - 1; 
            }
            else{
                low = mid + 1 ; 
            }
        } 
        return ans ; 
    }
    int upper_bound(vector<int> &arr , int n , int x){
        int low = 0 ;
        int high = n - 1 ; 
        int ans = n ;
        while(low <= high){
            int mid = low+(high - low)/2; 
            if(arr[mid] > x){
                ans = mid ; 
                high = mid - 1; 
            }
            else{
                low = mid + 1 ; 
            }
        } 
        return ans ; 
    }
    vector<int> searchRange(vector<int>& arr, int target) {
        int n = arr.size() ; 
        int lower = lower_bound(arr , n  , target) ;
        int upper = upper_bound(arr , n , target) ; 
        if(lower == n || arr[lower] != target){
            return {-1 , -1 }; 
        }
        return{lower , upper - 1}; 
    }
};