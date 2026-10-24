class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();

        for (char c : num.toCharArray()) {
            while (k > 0 && !st.isEmpty() && st.peek() > c) {
                st.pop();
                k--;
            }
            st.push(c);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        Iterator<Character> btt = st.descendingIterator();

        while (btt.hasNext()) {
            char cc = btt.next();

            if (sb.length() == 0 && cc == '0') {
                continue;
            }

            sb.append(cc);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}