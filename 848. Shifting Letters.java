class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int shift = 0;   
        char[] ch = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            shift = (shift + shifts[i]) % 26;
            ch[i] = (char) ((ch[i] - 'a' + shift) % 26 + 'a');
        }
        return new String(ch);
    }
}
