class Solution {
    public String replaceDigits(String s) {

        char[] ch = s.toCharArray();

        for (int i = 1; i < ch.length; i += 2) {
            ch[i] = (char) (ch[i - 1] + ch[i] - '0');
        }
        return String.valueOf(ch);
    }

}
