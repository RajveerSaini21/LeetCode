class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou" ;
        int maxV = 0 ; 
        int currentV = 0 ; 

        for(int i = 0 ; i < k ; i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                currentV++ ; 
            }
        }
        maxV = currentV ; 


        for (int i = k; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i - k)) != -1) {
                currentV--;
            }
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentV++;
            }
            maxV = Math.max(maxV, currentV);
        }
        return maxV ; 
    }

}