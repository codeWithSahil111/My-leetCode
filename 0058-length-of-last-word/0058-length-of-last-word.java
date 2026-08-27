class Solution {
    public int lengthOfLastWord(String s) {
        String word[] = s.split(" ");
        String lastW = word[word.length-1];
        int length = lastW.length();
        return length;
    }
}