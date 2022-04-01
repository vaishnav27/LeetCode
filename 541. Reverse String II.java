class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();

        for (int start = 0; start < s.length(); start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, c.length - 1);

            while (i < j) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }
        return new String(c);
    }
}
