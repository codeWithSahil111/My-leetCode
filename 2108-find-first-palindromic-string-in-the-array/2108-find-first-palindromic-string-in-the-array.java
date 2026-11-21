class Solution {
    public static boolean isPelin(String s){
        int i =0;
        int j = s.length()-1;

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<words.length; i++){
            if(isPelin(words[i])){
                sb.append(words[i]);
                break;
            }
        }
        return sb.toString();
    }
}