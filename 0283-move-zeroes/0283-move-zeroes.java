class Solution {
    public void moveZeroes(int[] nums) {
        // Optimal Solution 
        // int left = 0 ; 
        // for(int right = 0 ; right < nums.length ; right++){
        //     if(nums[right] != 0){
        //         int temp = nums[left] ; 
        //         nums[left] = nums[right] ; 
        //         nums[right] = temp ; 
        //         left++ ; 
        //     }
        // }

        // Brute force solution 
        List<Integer> temp = new ArrayList<>(); 
        int n = nums.length; 

        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0){
                temp.add(nums[i]) ; 
            }
        }

        int nz = temp.size() ; 

        for(int i = 0 ; i < nz ; i++){
            nums[i] = temp.get(i) ; 
        }

        for(int i = nz ; i < n ; i++){
            nums[i] = 0 ; 
        }
    }
}