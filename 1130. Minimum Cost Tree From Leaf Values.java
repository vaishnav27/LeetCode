
class Solution {
    public int mctFromLeafValues(int[] arr) {
        int res = 0;

        Stack<Integer> st = new Stack<>();
        st.push(Integer.MAX_VALUE);

        for (int i : arr) {
            while (st.peek() <= i) {
                int mid = st.pop();
                res += mid * Math.min(st.peek(), i);
            }
            st.push(i);
        }
        while (st.size() > 2) {
            res += st.pop() * st.peek();
        }
        return res;

    }
}
