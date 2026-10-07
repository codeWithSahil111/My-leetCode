class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c != '*'){
                st.push(c);
            } else {
                st.pop();
            }
        }
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }
}