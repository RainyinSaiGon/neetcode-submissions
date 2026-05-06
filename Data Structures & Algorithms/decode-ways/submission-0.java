class Solution {
    public int numDecodings(String s) {
      if (s.length() == 0) return 1;
      int[] dp = new int[s.length() + 1];
      dp[0] = 1;
      if (s.charAt(0) == '0') {
        dp[1] = 0;
      }
      else
        dp[1] = 1;

        for (int i = 2; i <= s.length(); i++) {
            char c = s.charAt(i - 1);
            if (c != '0')
                dp[i] += dp[i - 1];
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26)
                dp[i] += dp[i - 2];
        }

        return dp[s.length()];
    }
}
