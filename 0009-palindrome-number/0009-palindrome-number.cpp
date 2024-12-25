class Solution {
public:
    bool isPalindrome(int x) {

        if(x < 0){
            return false ;
        }

        long revNum = 0 ; 
        long temp = x ; 
        while(temp != 0){
            long lastDigit = temp % 10 ;
            revNum  = (revNum * 10) + lastDigit ; 
            temp /= 10 ;
        }
        return revNum == x ; 
    }
};