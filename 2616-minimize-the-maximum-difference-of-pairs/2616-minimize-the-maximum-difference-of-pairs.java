class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums) ; 
        int left = 0 ; 
        int right = nums[nums.length-1] - nums[0] ; 
        while(left < right){
            int mid = left + (right - left)/2 ; 
            if(canFormPair(nums , mid , p)){
                right = mid ; 
            }
            else{
                left = mid + 1 ; 
            }
        }
        return left ; 
    }

    public static boolean canFormPair(int[] nums , int maxDiff , int p){
        int count = 0 ; 
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] - nums[i-1] <= maxDiff){
                count++ ; 
                i++ ; 
            }
        }
        return count >= p ; 
    }
}