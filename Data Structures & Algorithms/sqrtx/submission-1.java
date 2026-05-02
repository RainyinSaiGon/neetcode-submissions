class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;

        while (start <= end) {
            long mid = (start + end) / 2;
            long pow = (mid * mid);
            if ((int)pow == x)
                return (int)mid;
            else if (pow > x) {
                end = mid - 1;
            }
            else
                start = mid + 1;
        }

        return (int) end;
    }
}