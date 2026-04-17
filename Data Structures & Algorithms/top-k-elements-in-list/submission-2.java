class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if (buckets[freq] == null)
                buckets[freq] = new ArrayList<>();
            buckets[freq].add(entry.getKey()); 
        }
        
        int counter = 0;
        for (int i = buckets.length - 1; i > 0 && counter < k; i--) {
            if (buckets[i] != null) {
                for (int j : buckets[i]) {
                    ans[counter] = j;
                    counter++;
                }
            }
        }


        return ans;

    }
}
