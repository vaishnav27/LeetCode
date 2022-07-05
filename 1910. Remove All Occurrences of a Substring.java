
class Solution {
    public String removeOccurrences(String s, String part) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));

            if (st.size() >= part.length()) {
                String x = "";
                for (int j = part.length() - 1; j >= 0; j--) {
                    char ch = part.charAt(j);
                    if (ch != st.peek()) {
                        for (int k = 0; k < x.length(); k++) {
                            st.push(x.charAt(k));
                        }
                        break;
                    } else {
                        x = st.peek() + x;
                        st.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
