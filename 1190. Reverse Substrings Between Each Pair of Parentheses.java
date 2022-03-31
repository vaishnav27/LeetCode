class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')') {
                Queue<Character> q = new LinkedList<>();

                while (st.peek() != '(') {
                    q.add(st.pop());
                }
                st.pop();
                while (q.size() > 0) {
                    st.push(q.remove());
                }
            } else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
