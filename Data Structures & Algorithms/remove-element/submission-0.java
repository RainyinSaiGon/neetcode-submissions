class Solution {
    public int removeElement(int[] nums, int val) {
        int ans = 0;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val)
                continue;
            arr.add(nums[i]);
            ans++;
        }
        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }

        return ans;
    }
}