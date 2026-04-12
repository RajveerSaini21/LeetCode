class Solution {
    public int nonSpecialCount(int l, int r) {
        int limit = (int)Math.sqrt(r) ; 
        boolean[] isPrime = new boolean[limit + 1] ; 
        for(int i = 2 ; i <= limit ; i++){
            isPrime[i] = true ; 
        }

        for(int i = 2 ; i*i <= limit ; i++){
            if(isPrime[i]){
                for(int j = i*i ; j <= limit ; j += i){
                    isPrime[j] = false ; 
                }
            }
        }

        int special_count = 0 ; 

        for(int i = 2 ; i <= limit ; i++){
            if(isPrime[i]){
                long square = i * i ; 
                if(square >= l && square <= r){
                    special_count++ ; 
                }
            }
        }

        return (r-l+1) - special_count ; 

    }
}