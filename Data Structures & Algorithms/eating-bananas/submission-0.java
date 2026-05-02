class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int start = 1;
        int end = max;
        while (start <= end) {
            int mid = (start + end) / 2;
            int tmp = 0;

            for (int i = 0; i < piles.length; i++) {
                tmp += (piles[i] + mid - 1)/ mid;
            }
            if (tmp > h) {
                start = mid + 1;
            } 
            else
                end = mid - 1;
        }

        return start;
    }
}
