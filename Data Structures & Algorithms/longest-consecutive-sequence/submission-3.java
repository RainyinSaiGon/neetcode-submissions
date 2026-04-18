class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> map = new HashSet<>();
        for (int i : nums) {
            map.add(i);
        }
        int ans = 0;
        for (int i : map) {
            if (!map.contains(i - 1)) {
                int current = i;
                int streak = 1;
                while (map.contains(current + 1)) {
                    streak++;
                    current++;
                }
                ans = Math.max(streak, ans);
            }
        }
        return ans;
    }
}
