class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < asteroids.length; i++) {
            boolean isExploded = false;
            if (asteroids[i] < 0) {
                while(!stack.isEmpty() && stack.peek() > 0) {
                    if (stack.peek() < Math.abs(asteroids[i])) {
                        stack.pop();
                    }
                    else if (stack.peek() ==  Math.abs(asteroids[i])) {
                        stack.pop();
                        isExploded = true;
                        break;
                    }
                    else {
                        isExploded = true;
                        break;
                    }
                }
                if (isExploded == false)
                    stack.push(asteroids[i]);
            }
            else {
                stack.push(asteroids[i]);
            }
        }
            
        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }

    
}