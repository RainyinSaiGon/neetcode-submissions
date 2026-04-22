class Solution {
    public boolean isPalindrome(String s) {
        s.trim();
        if (s == "") {
            return true;
        }

        int first = 0;
        int last = s.length() - 1;
        while (first < last) {
            while(first < last && !Character.isLetterOrDigit(s.charAt(first))) first++;
            while(first < last && !Character.isLetterOrDigit(s.charAt(last))) last--;
            if (first >= last)
                return true;
            if(Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last)))
            {
                System.out.println(s.charAt(first));
                System.out.println(s.charAt(last));
                return false;
            }
            first++;
            last--;
        }

        return true;
    }
}
