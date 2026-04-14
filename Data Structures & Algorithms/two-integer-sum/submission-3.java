class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> array = new HashMap<>();
        int[] ans = new int[2];
        int count = 0;
        for (int num : nums) {
            array.put(num, count);
            count++;
        }

        

        for (int i = 0; i < nums.length; i++) {
            if (array.containsKey(target - nums[i]) && i !=  array.get(target - nums[i]))
            {
                ans[0] = Math.min(i, array.get(target - nums[i]));
                ans[1] = Math.max(i, array.get(target - nums[i]));
                return ans;

            }
        }

        return ans;
    }
}
