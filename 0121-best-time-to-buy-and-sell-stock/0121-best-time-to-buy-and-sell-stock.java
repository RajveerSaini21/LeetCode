class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE ; 
        int maxProfit = 0 ; 

        for(int p : prices){
            if(p < minPrice){
                minPrice = p ; 
            }
            else{
                int profit = p - minPrice ; 
                maxProfit = Math.max(maxProfit , profit) ;
            }
        }
        return maxProfit ; 
    }
}