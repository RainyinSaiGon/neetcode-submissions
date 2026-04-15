class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        String ans =  "";
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            for (String s : strs) { 
                if (s.isEmpty() || s.length() <= i || s.charAt(i) != first.charAt(i) || first.isEmpty()) 
                    return ans;
            }
            ans += first.charAt(i);
        }
        return ans;
    }
}