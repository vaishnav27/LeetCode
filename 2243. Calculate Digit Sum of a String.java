class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            String str="";

            for (int i = 0; i < s.length(); i++) {
                int cur = 0;
                for (int j = i; j < i + k && j < s.length(); j++) {
                    cur += s.charAt(j) - '0';
                }
                i += k - 1;
                str += Integer.toString(cur);
            }
            s = str;
        }
        return s;
    }
}
