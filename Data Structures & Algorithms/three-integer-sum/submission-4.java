

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
     
        for (int i = 0; i < nums.length - 2; i++) {
            int first = i + 1;
            int last = nums.length - 1;
            while (first < last) {
                if (nums[first] + nums[last] == 0 - nums[i]) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[first]);
                    tmp.add(nums[last]);
                    ans.add(tmp);
                    
                    first++;
                }
                else if (nums[first] + nums[last] <  0 - nums[i]) {
                    first++;
                }
                else if (nums[first] + nums[last] >  0 - nums[i]) {
                    last--;
                }
            }
        }
        
        List<List<Integer>> ans1 = new ArrayList<>(ans);
        
        // --- NEW SORTING LOGIC ---
        // This sorts the lists lexicographically (just like LeetCode's expected output)
        Collections.sort(ans1, (listA, listB) -> {
            for (int i = 0; i < Math.min(listA.size(), listB.size()); i++) {
                if (!listA.get(i).equals(listB.get(i))) {
                    return listA.get(i).compareTo(listB.get(i));
                }
            }
            return Integer.compare(listA.size(), listB.size());
        });
        
        return ans1;
    }
}