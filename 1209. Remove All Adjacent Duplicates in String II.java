class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!st.isEmpty() && st.peek()[0] == s.charAt(i)) {
                st.peek()[1]++;
            } else {
                st.push(new int[] { s.charAt(i), 1 });
            }
            if (st.peek()[1] == k)
                st.pop();
        }
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            int[] top = st.pop();
            while (top[1]-- > 0) {
                sb.append((char) top[0]);
            }
        }
        return sb.reverse().toString();
    }
}
