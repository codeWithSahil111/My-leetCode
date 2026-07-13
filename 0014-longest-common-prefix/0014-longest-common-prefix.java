class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);

        char first[] = strs[0].toCharArray();
        char last[] = strs[strs.length-1].toCharArray();

        int len = Math.min(first.length, last.length);

        for(int i = 0; i<len; i++){
            if(first[i] == last[i]){
                result.append(first[i]);
            } else {
                break;
            }
        }
        return result.toString();
    }
}