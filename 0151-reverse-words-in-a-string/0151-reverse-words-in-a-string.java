class Solution {
    public String reverseWords(String s) {
        // StringBuilder answer = new StringBuilder();
        // StringBuilder helper = new StringBuilder();

        // for (int i = s.length() - 1; i >= 0; i--) {
        //     char ch = s.charAt(i);

        //     if (ch == ' ') {
        //         if (helper.length() > 0) {
        //             helper.reverse();
        //             answer.append(helper).append(" ");
        //             helper.setLength(0);
        //         }
        //     } else {
        //         helper.append(ch);
        //     }
        // }

        // if (helper.length() > 0) {
        //     helper.reverse();
        //     answer.append(helper);
        // }

        // int len = answer.length();
        // if (len > 0 && answer.charAt(len - 1) == ' ') {
        //     answer.setLength(len - 1);
        // }

        // return answer.toString();
        String[] word = s.trim().split("\\s+"); 

        StringBuilder answer = new StringBuilder(); 
        for(int i = word.length - 1 ; i >= 0 ; i--){
            answer.append(word[i]).append(" ");
        }
        return answer.toString().trim();
    }
}
