class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false ; 
        long rev = 0 ; 
        long temp = x ; 

        while(temp != 0){
            long last = temp % 10 ; 
            rev = (rev*10)+last ; 
            temp /= 10 ; 
        }

        if(rev == x) return true ; 
        return false ; 
    }
}