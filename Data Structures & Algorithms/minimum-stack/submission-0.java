class MinStack {

    Deque <Integer> stack;
    TreeMap<Integer, Integer> tree;

    public MinStack() {
        stack = new ArrayDeque<>();
        tree = new TreeMap<>();
    }
    
    public void push(int val) {
        stack.push(val);
        tree.put(val, tree.getOrDefault(val, 0) + 1);
    }
    
    public void pop() {
        int removeNum = stack.pop();
        if (tree.get(removeNum) > 1) {
            tree.put(removeNum, tree.get(removeNum) - 1);
        }
        else {
            tree.remove(removeNum);
        }

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return tree.firstKey();
    }
}
