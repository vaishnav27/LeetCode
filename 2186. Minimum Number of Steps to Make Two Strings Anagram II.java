class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        int[] freq1 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            freq1[t.charAt(i) - 'a']++;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != freq1[i]) {
                ans += Math.abs(freq[i] - freq1[i]);
            }
        }
        return ans;

    }
}
