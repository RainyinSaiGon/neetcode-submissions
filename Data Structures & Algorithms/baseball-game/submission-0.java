class Solution {
    public int calPoints(String[] operations) {
        Deque<String> stack = new ArrayDeque<>();
        int ans = 0;
        for (String tmp : operations) {
            if (tmp.equals("+")) {
                String tmp1 = stack.poll();
                String tmp2 = stack.peek();
                int nextNum = Integer.parseInt(tmp1) + Integer.parseInt(tmp2);
                stack.push(tmp1);
                stack.push(Integer.toString(nextNum));
            } else if (tmp.equals("C")) {
                stack.pop();
            }
            else if (tmp.equals("D")) {
                String tmp1 = stack.peek();
                int nextNum = Integer.parseInt(tmp1) * 2;
                stack.push(Integer.toString(nextNum));
            }
            else
                stack.push(tmp);
        }

        for (String i : stack) {
            ans += Integer.parseInt(i);
        }
        return ans;
    }
}