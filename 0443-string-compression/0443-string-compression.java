class Solution {
    public int compress(char[] chars) {
        int size = chars.length; 
        StringBuilder s = new StringBuilder(); 
        int count = 1 ; 

        for(int i = 0 ; i < size ; i++){
            if(i + 1. < size && chars[i] == chars[i+1]){
                count++ ; 
            }
            else{
                s.append(chars[i]); 
                if(count > 1){
                    s.append(count); 
                    count = 1 ; 
                }
            }
        }
        for(int i = 0 ; i < s.length() ; i++){
            chars[i] = s.charAt(i) ; 
        }
        return s.length(); 
    }
}