class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+"); 

        StringBuilder answer = new StringBuilder(); 
        for(int i = word.length - 1 ; i >= 0 ; i--){
            answer.append(word[i]).append(" ");
        }
        return answer.toString().trim();
    }
}
