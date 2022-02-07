class Solution {
    public char findTheDifference(String s, String t) {
        int char_s = 0, char_t = 0;

        for (int i = 0; i < s.length(); i++) {
            char_s += (int) s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            char_t += (int) s.charAt(i);
        }
        return (char) (char_t - char_s);
    }
}
