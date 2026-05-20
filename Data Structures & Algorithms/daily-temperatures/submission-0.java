class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                ans[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            ans[stack.pop()] = 0;
        }

        return ans;
    }
}
