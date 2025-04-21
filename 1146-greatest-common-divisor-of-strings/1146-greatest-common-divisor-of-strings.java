class Solution {
    public String gcdOfStrings(String str1, String str2) {
 
        if(!(str1+str2).equals(str2+str1))return "" ; 

        int size1 = str1.length(); 
        int size2 = str2.length(); 

        String result = str1.substring(0 , gcdLength(size1 , size2)); 

        return result ; 
    }

    public int gcdLength(int size1 , int size2){
        while(size2 != 0){
            int temp = size2; 
            size2 = size1 % size2 ; 
            size1 = temp ; 
        }
        return size1 ; 
    }
}