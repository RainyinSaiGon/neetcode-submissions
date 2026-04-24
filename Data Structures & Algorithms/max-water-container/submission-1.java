class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;
        int first = 0;
        int last = heights.length - 1;

        while (first < last) {
            int length = last - first;
            int min = Math.min(heights[first], heights[last]);

            int area = min * length;
            ans = Math.max(ans, area);

            if (heights[first] < heights[last])
                first++;
            else
                last--;

        }
        return ans;
    }
}
