class MyStack {


    Queue<Integer> mainQueue;
   

    public MyStack() {
       mainQueue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        mainQueue.add(x);
        int size = mainQueue.size();
        for (int i = 0; i < size - 1; i++) {
            mainQueue.add(mainQueue.poll());
        }
    }
    
    public int pop() {
        return mainQueue.poll();
    }
    
    public int top() {
        return mainQueue.peek();
    }
    
    public boolean empty() {
       return mainQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */