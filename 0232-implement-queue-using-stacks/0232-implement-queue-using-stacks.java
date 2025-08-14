class MyQueue {
    Stack<Integer> s ;
    public MyQueue() {
        s=new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while(!s.isEmpty()){
            temp.push(s.pop());
        }
        int rem = temp.pop();
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        return rem;
    }
    
    public int peek() {
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            temp.push(s.pop()); // Reverse the order
        }
        int peek = temp.peek(); // Get the front element
        while (!temp.isEmpty()) {
            s.push(temp.pop()); // Restore the stack
        }
        return peek;
    }
    
    public boolean empty() {
        return s.isEmpty();
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