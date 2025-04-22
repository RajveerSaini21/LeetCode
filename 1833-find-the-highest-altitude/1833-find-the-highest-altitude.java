class Solution {
    public int largestAltitude(int[] gain) {
        int maxH = 0 ; 
        int currH = 0 ; 

        for(int i = 0 ; i < gain.length ; i++){
            currH += gain[i]; 
             maxH = Math.max(currH , maxH); 
        }
        return maxH ;
    }
}