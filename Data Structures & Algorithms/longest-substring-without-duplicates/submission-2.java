class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;
        HashMap<Character, Integer> set = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (set.containsKey(c)) {
                System.out.println(c);
                left = Math.max(set.get(c) + 1, left);
                System.out.println(left);
            }
            set.put(c, right);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
