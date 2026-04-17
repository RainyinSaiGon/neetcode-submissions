class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        HashMap<Integer, List<Integer>> buckets = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (buckets.containsKey(entry.getValue())) {
                List<Integer> tmp = buckets.get(entry.getValue());
                tmp.add(entry.getKey());
                buckets.put(entry.getValue(), tmp);
            }
            else 
            {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(entry.getKey());
                buckets.put(entry.getValue(), tmp);
            }
        }


        List<Integer> arr = new ArrayList<>(buckets.keySet());
        Collections.sort(arr, Collections.reverseOrder());

        int count = 0;
        for (int i = 0; i < k; i++)
        {
            List<Integer> tmp = buckets.get(arr.get(i));
            for (int j : tmp) {
                ans[count] = j;
                count++;
            }
            if (count == k)
                break;

        }
        return ans;

    }
}
