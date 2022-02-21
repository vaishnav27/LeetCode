
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                ans.add(word);
            }
        }
        return ans;
    }

    public boolean matches(String word, String pattern) {

        char[] patterntoWord = new char[26];
        char[] wordtoPattern = new char[26];

        for (int i = 0; i < word.length(); i++) {
            char wordChar = word.charAt(i);
            char patternChar = pattern.charAt(i);

            if (patterntoWord[patternChar - 'a'] == 0) {
                patterntoWord[patternChar - 'a'] = wordChar;
            }

            if (wordtoPattern[wordChar - 'a'] == 0) {
                wordtoPattern[wordChar - 'a'] = patternChar;
            }

            if (patterntoWord[patternChar - 'a'] != wordChar || wordtoPattern[wordChar - 'a'] != patternChar) {
                return false;
            }
        }
        return true;
    }
}
