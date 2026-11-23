class Solution {
    public String removeOuterParentheses(String s) {
        int opB = 0;
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == '(' && opB++> 0){
                sb.append(ch);
            } else if(ch == ')' && opB--> 1){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}