class Solution {
    public static boolean palinDromeHelper(String s,int i,int j){
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
         int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (left != right) {
            return palinDromeHelper(s, i+1, j) || palinDromeHelper(s, i, j-1);
       } else {
                i++;
                j--;
            }
        }
        return true;
    }
}