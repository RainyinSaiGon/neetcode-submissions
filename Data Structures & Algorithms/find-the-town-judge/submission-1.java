class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] ans = new int[n + 1];

        for (int i[] : trust) {
            ans[i[1]]++;
            ans[i[0]]--;
        }


        for (int i = 0; i < ans.length; i++) {
            System.out.println(i);
            if (ans[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}