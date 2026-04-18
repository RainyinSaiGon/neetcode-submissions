class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (buckets[entry.getValue()] == null) 
                buckets[entry.getValue()] = new ArrayList<>();
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int count = 0;
        for (int i = nums.length; i > 0 && count < k; i--) {
            if (buckets[i] != null) {
                for (int j : buckets[i]) {
                    ans[count] = j;
                    count++;
                }
            }
        }
        return ans;
    }
}
