

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for (int x:pushed) {
            st.push(x);

            while (!st.empty() && j < pushed.length && st.peek() ==popped[j]) {
                st.pop();
                j++;
            }
        }
        return j == pushed.length;
    }
}
