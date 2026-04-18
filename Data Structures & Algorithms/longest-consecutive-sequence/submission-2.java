class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        TreeSet<Integer> ans = new TreeSet<>();

        for (int i : nums) {
            ans.add(i);
        }
        List<Integer> arr = new ArrayList<>(ans);


        int count = 1;
        int max = 1;

        for (int i = 0; i < arr.size() - 1; i++) {
            int cur = arr.get(i);
            int next = arr.get(i + 1);
            System.out.println(cur + " " + next);
            if (cur + 1 == next) {
                count++;
                if (count > max)
                    max = count;
            }
            else
                count = 1;
        }
        return max;
    }
}
