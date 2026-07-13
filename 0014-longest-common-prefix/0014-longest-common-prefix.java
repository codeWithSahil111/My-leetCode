class Solution {
    public String longestCommonPrefix(String[] strs) {
         String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String curr = strs[i];

            int j = 0;
            while (j < prefix.length() && j < curr.length() && prefix.charAt(j) == curr.charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);

            if (prefix.equals(""))
                return "";
        }
        return prefix;
    }
}