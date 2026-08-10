class Solution {
    public boolean detectCapitalUse(String word) {
        int uperCase = 0;
        for(int i =0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                uperCase++;
            }
        }
     return uperCase == word.length() 
     || uperCase == 0 
     || (uperCase == 1 && Character.isUpperCase(word.charAt(0)));
    }
}