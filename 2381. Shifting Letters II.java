class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] offsets = new int[n + 1];
        for (int i = 0; i < shifts.length; i++) {
            int dir = shifts[i][2];
            offsets[shifts[i][0]] += (dir == 1) ? 1 : -1;
            // System.out.println("i[0]" + offsets[shifts[i][0]]);
            offsets[shifts[i][1] + 1] -= (dir == 1) ? 1 : -1;
            // System.out.println("i[1]" + offsets[shifts[i][1] + 1]);
        }
       
        int prefix = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            prefix += offsets[i];
            while (prefix < 0) {
                prefix += 26;
            }
            int ch = (s.charAt(i) - 'a' + prefix) % 26;
            ans += (char) ('a' + ch);
        }
        return ans;
    }
}
