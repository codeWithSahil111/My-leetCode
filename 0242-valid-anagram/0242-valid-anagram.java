class Solution {
    public boolean isAnagram(String s, String t) {
         char ch[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        int i = 0;
        int j = 0;

        boolean flag = false;

        if(ch.length != ch2.length) return false;

        while (i < ch.length || j < ch2.length) {
            if (ch[i] == ch2[j]) {
                flag = true;
                i++;
                j++;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}