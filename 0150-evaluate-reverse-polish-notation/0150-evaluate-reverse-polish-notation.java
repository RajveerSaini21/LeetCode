class Solution {
    public int evalRPN(String[] s) {
        Stack<Integer> stack = new Stack<>(); 
        
        int i = 0 ; 
        while(i < s.length){
            String token = s[i]; 

            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = stack.peek() ; 
                stack.pop(); 
                int a = stack.peek() ;
                stack.pop();  

                switch(token){
                    case "+":
                        stack.push(a + b) ; 
                        break ; 
                    
                    case "-": 
                        stack.push(a - b); 
                        break ; 

                    case "*": 
                        stack.push(a * b); 
                        break ; 
                    
                    case "/": 
                        stack.push(a / b); 
                        break ; 
                }
            }

            else{
                stack.push(Integer.parseInt(token));
            }

            i++ ; 

        }
        return stack.pop(); 
    }
}