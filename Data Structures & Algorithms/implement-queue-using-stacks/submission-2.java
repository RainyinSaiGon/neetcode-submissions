class MyQueue {


    Deque<Integer> stack;
    Deque<Integer> tmpStack;

    public MyQueue() {
        stack = new ArrayDeque<>();
        tmpStack = new ArrayDeque<>();
    }
    
    public void push(int x) {
       stack.push(x);
    }
    
    public int pop() {
       if (tmpStack.isEmpty()) {
            while (!stack.isEmpty()) {
                tmpStack.push(stack.pop());
            }
       }
       return tmpStack.pop();      
    }
    
    public int peek() {
        if (tmpStack.isEmpty()) {
            while (!stack.isEmpty()) {
                tmpStack.push(stack.pop());
            }
       }
       return tmpStack.peek();      
    }
    
    public boolean empty() {
        return stack.isEmpty() && tmpStack.isEmpty();
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