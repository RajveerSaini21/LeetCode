class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums); 

        if(nums.length < 2) return 0 ; 
        int left = 0 ; 
        int right = nums.length - 1 ; 
        int count = 0 ; 

        while(left < right){
            if(nums[left] + nums[right] < k) left++ ; 
            else if(nums[left] + nums[right] > k) right-- ; 
            else{
                count++ ; 
                left++ ;
                right-- ;
            }
        }

        return count ; 
    }
}