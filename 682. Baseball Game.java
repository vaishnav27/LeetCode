
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();


        for (String s : ops) {
            if (s.equals("+")) {
                int top = st.pop();
                int prevtop = top + st.peek();
                st.push(top);
                st.push(prevtop);
            } else if (s.equals("C"))
                st.pop();
            else if (s.equals("D"))
                st.push(2 * st.peek());
            else
                st.push(Integer.valueOf(s));
        }
        int ans = 0;
        for (int score : st) {
            ans += score;
        }
        return ans;

    }
  }
