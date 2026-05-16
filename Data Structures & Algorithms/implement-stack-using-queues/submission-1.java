class MyStack {


    Queue<Integer> mainQueue;
   

    public MyStack() {
       mainQueue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        List<Integer> list = new ArrayList<>();
        while (!mainQueue.isEmpty()) {
            list.add(mainQueue.poll());
        }
        mainQueue.add(x);
        for (int i : list) {
            mainQueue.add(i);
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