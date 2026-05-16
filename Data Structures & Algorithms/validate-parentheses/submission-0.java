class Solution {
    public boolean isValid(String s) {
         HashMap<Character, Character> map = new HashMap<>();

        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');


        Deque<Character> stack = new ArrayDeque<>();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ']' || c == '}' || c == ')') {
                if (stack.isEmpty() || map.get(c) != stack.peek())
                    return false;
                else
                    stack.pop();
            }
            else
                stack.push(c);
        }

        return stack.isEmpty();
    }
}
