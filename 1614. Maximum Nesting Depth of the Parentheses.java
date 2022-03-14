
class Solution {
    public int maxDepth(String s) {

        Stack<Character> st = new Stack();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                int x = st.size();  
               
                max = Math.max(max, x);
                st.pop(); 
            }
        }
        return max;
       
       
    }
}
