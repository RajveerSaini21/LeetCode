class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>() ;
        backtracking(result , new ArrayList<>() , 1 ,  n ,  k); 
        return result ; 
    }

    public void backtracking(List<List<Integer>> result , List<Integer> temp , int start , int n , int k){
        if(temp.size() == k){
            result.add(new ArrayList<>(temp));
            return ; 
        }

        if(start > n) return ; 

        for(int i = start ; i <= n ; i++){
            temp.add(i) ; 
            backtracking(result , temp , i+1 , n , k ); 
            temp.remove(temp.size() -1) ;           
        }
    }
}