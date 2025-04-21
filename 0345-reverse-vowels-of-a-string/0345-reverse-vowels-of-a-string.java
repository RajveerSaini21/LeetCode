class Solution {
    public String reverseVowels(String s) { 
        int i = 0 ; 
        int j = s.length()-1 ;

        char[] str = s.toCharArray() ; 

        String isVowels = "AEIOUaeiou"; 

        while(i < j){
            while(i < j && !isVowels.contains(String.valueOf(str[i]))) i++; 
            while(i < j && !isVowels.contains(String.valueOf(str[j]))) j-- ; 

            char temp = str[i] ;
            str[i] = str[j] ; 
            str[j] = temp ; 

            i++ ; 
            j-- ; 
        }

        return new String(str); 
    }
}