class Solution {
    public int longestSubarray(int[] nums) {
        int j = 0 ; 
        int n = 0 ; 
        int max = 0 ; 

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                n++ ; 
            }

            while(n > 1){
                if(nums[j] == 0){
                    n-- ; 
                }
                j++ ; 
            }
            max = Math.max(max, i - j);

        }
         
    return max ; 
    }
}