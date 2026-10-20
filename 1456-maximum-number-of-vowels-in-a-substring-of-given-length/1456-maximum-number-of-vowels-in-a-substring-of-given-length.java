class Solution {
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int curVo = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                curVo++;
            }
        }
        int maxVo = curVo;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                curVo++;
            }
            if (isVowel(s.charAt(i - k))) {
                curVo--;
            }
            maxVo = Math.max(maxVo, curVo);
            if (maxVo == k) {
                return k;
            }
        }
        return maxVo;
    }
}