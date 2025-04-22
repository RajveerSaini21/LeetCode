class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0 ;
        int sum1 = 0 ; 

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i]; 
        }
        for(int i = 0 ; i < nums.length ; i++){
            sum -= nums[i]; 
            if(sum == sum1) return i ; 
            sum1+=nums[i];   
        }

        return -1 ; 
    }
}