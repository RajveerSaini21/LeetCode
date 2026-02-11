class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0 ; 
        int right = 0 ; 

        for(int weight : weights){
            left = Math.max(left , weight) ;
            right += weight ; 
        }


        while(left < right){
            int mid = left + (right - left) / 2 ; 
            if(ship(weights , mid , days)){
                right = mid ; 
            }
            else left = mid + 1 ;
        }
        return left ; 
    }

        public static boolean ship(int[] weights , int capacity , int day){
            int currLoad = 0 ; 
            int days = 1 ; 

            for(int w : weights){
                if(currLoad + w > capacity){
                    days++ ; 
                    currLoad = 0 ; 
                }
                currLoad += w ; 
                if(days > day){
                    return false ; 
                }
            }
            return true ; 
        }
}