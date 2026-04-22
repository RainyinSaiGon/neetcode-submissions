class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length - 1;

        int ans[] = new int[2];

        while (first < last) {
            int sum = numbers[first] + numbers[last];
            if (sum > target) last--;
            else if (sum < target) first++;
            else if (sum == target) {
                ans[0] = first + 1;
                ans[1] = last + 1;
                break;
            }
        }

        return ans;
    }
}
