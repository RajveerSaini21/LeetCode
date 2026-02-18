import java.util.Stack;

public class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        int sign = 1;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            } 
            
            if (c == '+' || c == '-' || i == s.length() - 1 || c == ')') {
                if (c == '+' || c == '-') {
                    result += sign * currentNumber;
                    currentNumber = 0;
                    sign = (c == '+') ? 1 : -1;
                }
                
                if (i == s.length() - 1 || c == ')') {
                    result += sign * currentNumber;
                    currentNumber = 0;
                }
            }
            
            if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }
            
            if (c == ')') {
                result += sign * currentNumber;
                currentNumber = 0;
                result *= stack.pop(); 
                result += stack.pop(); 
            }
        }
        
        return result;
    }
}
