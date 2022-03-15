class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] ch = s.toCharArray();
        int c = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                c++;
            } else if (ch[i] == ')') {
                if (c > 0) {
                    c--;
                } else {
                    ch[i] = 0;
                }
            }
        }
        c=0;
        for (int i = ch.length-1; i >= 0; i--) {
            if (ch[i] == ')') {
                c++;
            } else if (ch[i] == '(') {
                if (c > 0) {
                    c--;
                } else {
                    ch[i] = 0;
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        for (char c1 : ch) {
        if(c1!=0)
            sb.append(c1);
        }
        return sb.toString();
    }
}
