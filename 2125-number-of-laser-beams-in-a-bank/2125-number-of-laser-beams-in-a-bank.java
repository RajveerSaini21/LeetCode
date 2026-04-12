class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0 ; 
        int total = 0 ; 
        for(String row : bank){
            int curr = 0 ; 

            for(char ch : row.toCharArray()){
                if(ch == '1'){
                    curr++ ; 
                }
            }
            if(curr > 0){
                total += prev * curr ; 
                prev = curr ; 
            }
        }
        return total ; 
    }
}