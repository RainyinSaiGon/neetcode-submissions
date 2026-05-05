class Solution {
    public boolean canJump(int[] nums) {
        int ans = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, nums[i] + i);
            if (i == index) {
                index = ans;
            }
        }

        System.out.println(index);
        return index >= nums.length - 1;
       
    }
}
