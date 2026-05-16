class MyQueue {


    Deque<Integer> stack;

    public MyQueue() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        Deque<Integer> tmpStack = new ArrayDeque<>();
        while(!stack.isEmpty()) {
            tmpStack.push(stack.pop());
        }
        stack.push(x);
        while(!tmpStack.isEmpty()) {
            stack.push(tmpStack.pop());
        }
    }
    
    public int pop() {
        return stack.pop();
    }
    
    public int peek() {
        return stack.peek();
        
    }
    
    public boolean empty() {
        return stack.isEmpty();
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