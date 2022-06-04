class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freq = new int[26], freq1 = new int[26];

        if (word1.length() != word2.length())
            return false;

        for (int i = 0; i < word1.length(); i++) {
            freq[word1.charAt(i) - 'a']++;

        }
        for (int i = 0; i < word2.length(); i++) {
            freq1[word2.charAt(i) - 'a']++;

        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == freq1[i])
                continue;
            if (freq[i] == 0 || freq1[i] == 0)
                return false;
        }
        Arrays.sort(freq);
        Arrays.sort(freq1);

        for (int i = 0; i < 26; i++) {
            if (freq[i] != freq1[i])
                return false;
        }
        return true;
    }
}
