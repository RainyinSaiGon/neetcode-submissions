class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> array = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (array.containsKey(nums[i])) {
                array.put(nums[i], array.get(nums[i]) + 1);
            }
            else {
                array.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : array.entrySet()) {
            if (entry.getValue() > 1)
                return true;
        }

        return false;
    }
}