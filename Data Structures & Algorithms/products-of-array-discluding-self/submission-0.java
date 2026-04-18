class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int sign = 0;
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sign = i;
                zero++;
                continue;
            }
            product *= nums[i];
        }

        int[] output = new int[nums.length];
        if (zero > 1)
            return output;

        else if (zero == 1) {
            output[sign] = product;
            return output;
        }

        else if (zero == 0) {
            for (int i = 0; i < output.length; i++) {
                output[i] = (int) product / nums[i];
            }

        }
        return output;
    }
}
