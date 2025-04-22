class Solution {
    public int longestSubarray(int[] nums) {
        int mid = -1 ; 
        int i = 0 , j = 0 ; 
        int ans = 0 ; 
        int n = nums.length ; 

        while(j < n){
            if(nums[j] == 0){
                ans = Math.max(ans , j-i-1);
                i = mid + 1 ; 
                mid = j ; 
            }
            j++;
        } 
        ans = Math.max(ans , j-i-1); 
        return ans ;  
    }
}