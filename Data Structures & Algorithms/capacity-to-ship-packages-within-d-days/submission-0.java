class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0; // maximum number in weights
        int end = 0;   // total sum of weights

        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end += weights[i];
        }

        int dayToShip = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int tmp = 0;
            dayToShip = 0;
            for (int i = 0; i < weights.length; i++) {
                while (i < weights.length && tmp + weights[i] <= mid) {
                    tmp += weights[i];
                    i++;
                }
                dayToShip++;
                tmp = 0;
                i--;
            }
            System.out.println(mid);
            System.out.println(dayToShip);
            if (dayToShip > days) {
                start = mid + 1;
            }
            else
                end = mid - 1;
        }

        return start;

    }
}