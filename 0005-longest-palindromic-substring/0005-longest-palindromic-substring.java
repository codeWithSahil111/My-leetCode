class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return s;

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            int low = i;
            int high = i;

            while (low >= 0 && high < s.length()
                    && s.charAt(low) == s.charAt(high)) {

                String temp = s.substring(low, high + 1);

                if (temp.length() > ans.length()) {
                    ans = temp;
                }

                low--;
                high++;
            }

            low = i;
            high = i + 1;

            while (low >= 0 && high < s.length()
                    && s.charAt(low) == s.charAt(high)) {

                String temp = s.substring(low, high + 1);

                if (temp.length() > ans.length()) {
                    ans = temp;
                }

                low--;
                high++;
            }
        }

        return ans;
    }
}