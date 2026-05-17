class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String tmp : tokens) {
            switch(tmp) {
                case "+":
                    int topNum = stack.pop();
                    int result = topNum + stack.pop();
                    stack.push(result);
                    break;
                case "-":
                    int topNum2 = stack.pop();
                    int result2 = stack.pop() - topNum2;
                    stack.push(result2);
                    break;
                case "*":
                    int topNum3 = stack.pop();
                    int result3 = topNum3 * stack.pop();
                    stack.push(result3);
                    break;
                case "/":
                    int topNum4 = stack.pop();
                    int result4 = stack.pop();
                    stack.push(result4 / topNum4);
                    break;
                default:
                    stack.push(Integer.parseInt(tmp));
            }
        }
        return stack.peek();
        
    }
}
