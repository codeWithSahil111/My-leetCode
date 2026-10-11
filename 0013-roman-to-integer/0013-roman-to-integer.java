
class Solution {
    public int romanToInt(String s) {
        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == 'I') {
                ans += 1;
            } else if (c == 'V') {
                ans += 5;
            } else if (c == 'X') {
                ans += 10;
            } else if (c == 'L') {
                ans += 50;
            } else if (c == 'C') {
                ans += 100;
            } else if (c == 'D') {
                ans += 500;
            } else if (c == 'M') {
                ans += 1000;
            }
            if (i < s.length() - 1) {
                if (value(c) < value(s.charAt(i + 1))) {
                    ans -= 2 * value(c);
                }
            }
        }

        return ans;
    }

    private int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}
