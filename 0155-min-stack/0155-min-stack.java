class MinStack {
    Stack<Integer> main;
    Stack<Integer> min;
    public MinStack() {
        main = new Stack<Integer>();
        min = new Stack<Integer>();      
    }
    
    public void push(int val) {
        main.push(val);
        if(min.isEmpty() || val<=min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(main.peek().equals(min.peek())){
            min.pop();
        }
        main.pop();
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */