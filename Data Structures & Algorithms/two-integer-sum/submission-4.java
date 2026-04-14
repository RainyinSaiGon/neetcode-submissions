class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> array = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (array.containsKey(complement))
                return new int[]{array.get(complement), i};
            array.put(nums[i], i);
        }
        return ans;
    }
}
