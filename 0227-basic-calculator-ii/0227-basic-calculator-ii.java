public class Solution {
    public int calculate(String s) {
        s = s.replaceAll(" ", "");
        
        int result = 0;
        int currentNum = 0;
        int lastNum = 0;
        char lastOperator = '+';

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNum = currentNum * 10 + (currentChar - '0');
            }

            if (!Character.isDigit(currentChar) || i == s.length() - 1) {
                if (lastOperator == '+') {
                    result += lastNum;
                    lastNum = currentNum;
                } else if (lastOperator == '-') {
                    result += lastNum;
                    lastNum = -currentNum;
                } else if (lastOperator == '*') {
                    lastNum = lastNum * currentNum;
                } else if (lastOperator == '/') {
                    lastNum = lastNum / currentNum;
                }

                lastOperator = currentChar;
                currentNum = 0;
            }
        }

        result += lastNum;

        return result;
    }
}
