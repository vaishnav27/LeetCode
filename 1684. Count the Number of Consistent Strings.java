

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;

        boolean[] alpha = new boolean[26];

        for (char c : allowed.toCharArray()) {
            alpha[c - 'a'] = true;
        }
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (alpha[c - 'a'] == false) {
                    count--;
                    break;
                }
            }
        }
        return count;

    }
}
