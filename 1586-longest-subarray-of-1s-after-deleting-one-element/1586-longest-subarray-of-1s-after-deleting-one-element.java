class Solution {
    public int longestSubarray(int[] nums) {
        int j = 0 ; 
        int zeroCount = 0 ; 
        int maxCount = 0 ; 

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                zeroCount++ ; 
            }

            while(zeroCount > 1){
                if(nums[j] == 0){
                    zeroCount-- ; 
                }
                j++ ; 
            }
            maxCount = Math.max(maxCount, i - j);

        }
         
    return maxCount ; 
    }
}