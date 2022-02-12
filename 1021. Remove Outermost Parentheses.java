
class Solution {
    public String removeOuterParentheses(String s) {

        int openend = 0, closed = 0, start = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                openend++;
            else if (s.charAt(i) == ')')
                closed++;
            if (openend == closed) {
                sb.append(s.substring(start + 1, i));
                start = i+1;
            }
        }
        return sb.toString();

    }
}
