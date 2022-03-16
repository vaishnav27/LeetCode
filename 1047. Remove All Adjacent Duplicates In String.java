

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (st.empty()) {
                st.push(ch);
            } else {
                if (ch == st.peek()) {
                    st.pop();

                } else {
                    st.push(ch);
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!st.empty()) {
            sb.append(st.pop());
        }
        sb.reverse();

        return sb.toString();

    }
}
