class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> curr = new ArrayList<>(); 
        backtracking(result , curr , nums , 0) ; 
        return result ; 
    }

    public void backtracking(List<List<Integer>> result , List<Integer> curr , int[] nums , int start) {
    
        result.add(new ArrayList<>(curr)) ; 
        
        for(int i = start ; i < nums.length ; i++){
            curr.add(nums[i]) ; 
            backtracking(result , curr , nums , i+1) ; 
            curr.remove(curr.size() - 1) ; 
        }
    }
}