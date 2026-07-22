class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArr = new int[2 * nums.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = nums[i % nums.length]; 
        }
        return newArr;
    }
}