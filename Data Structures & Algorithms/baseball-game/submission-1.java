class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ans = 0;
        for (String tmp : operations) {
            switch (tmp) {
                case "+":
                    int top = stack.pop();
                    int nextNum = top + stack.peek();
                    stack.push(top);
                    stack.push(nextNum);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(tmp));
            }
        }

        for (int i  : stack) {
            ans += i;
        }
        return ans;
    }
    }
