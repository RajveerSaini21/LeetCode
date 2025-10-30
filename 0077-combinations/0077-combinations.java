class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>() ;
        List<Integer> curr = new ArrayList<>(); 
        backtracking(result , curr , 1 ,  n ,  k); 
        return result ; 
    }

    public void backtracking(List<List<Integer>> result , List<Integer> temp , int start , int n , int k){
        if(temp.size() == k){
            result.add(new ArrayList<>(temp));
            return ; 
        }

        if(start > n) return ; 
    
            temp.add(start) ; 
            backtracking(result , temp , start+1 , n , k ); 

            temp.remove(temp.size() -1) ;
            backtracking(result , temp , start+1 , n , k ); 

    }
}