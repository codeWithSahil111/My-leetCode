class Solution {
    public boolean isPalindrome(int x) {
                int ld = 0;
        int rev = 0;
        int n = x;
        if(x == 0) {
            return true;
        }
        if(x <0) {
            return false;
        }
        while (x!= 0) {
            ld = x % 10;
            rev = rev * 10 + ld;
            x = x / 10;
        }
        if(n == rev) {
            return true;
        }
        else {
            return false;
        }
    }
}