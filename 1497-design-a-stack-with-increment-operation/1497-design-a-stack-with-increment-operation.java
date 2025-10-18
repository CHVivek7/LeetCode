class CustomStack {
    Stack<Integer> stack;
    int max;
    public CustomStack(int maxSize) {
        stack = new Stack<>();
        max = maxSize;
    }
    
    public void push(int x) {
        if(max > stack.size()){
            stack.push(x);
        }
    }
    
    public int pop() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.pop();
    }
    
    public void increment(int k, int val) {
        Stack<Integer> newStack = new Stack<>();
        while(!stack.isEmpty()){
            newStack.push(stack.pop());
        }
        int count=0;
        while(!newStack.isEmpty()){
            if(count < k){
                count++;
                stack.push(newStack.pop()+val);
            }
            else{
                stack.push(newStack.pop());
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */