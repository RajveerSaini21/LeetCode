class MyQueue {
    Stack<Integer> input ; 
    Stack<Integer> output ; 
    public MyQueue() {
        input = new Stack<>(); 
        output = new Stack<>(); 
    }
    
    public void push(int x) {
        input.push(x); 
    }
    
    public int pop() {
        shiftStack();
        return output.pop(); 
    }
    
    public int peek() {
        shiftStack(); 
        return output.peek(); 
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public void shiftStack(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop()); 
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */