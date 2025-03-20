import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int n = temp.length ;
        int[] days = new int[n]; 

        for (int i = n-1; i >= 0; i--) {
            while (!stack.isEmpty() && temp[stack.peek()] <= temp[i]) {
                stack.pop();
            }
            if(!stack.empty()){
                days[i] = stack.peek() - i ; 
            }
            stack.push(i);
        }

        return days;
    }
}    