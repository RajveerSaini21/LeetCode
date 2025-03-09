class Solution {
    public int findNumbers(int[] arr) {
        int count = 0 ; 
        for(int num : arr){
            if(even(num)){
                count++ ; 
            }
        }
        return count ; 
    }

    static boolean even(int num){
        int numOfDigits = digits(num);
        // if(numOfDigits % 2 == 0){
        //     return true ;
        // }
        // return false ; 

        return numOfDigits % 2 == 0 ; 
    }

    static int digits(int num){

        if(num < 0){
            num = num * -1 ; 
        }

        if(num == 0){
            return 1 ; 
        }

        int count = 0 ; 
        while(num > 0){
            count++ ; 
            num /= 10 ; 
        }
        return count ; 
    }
}