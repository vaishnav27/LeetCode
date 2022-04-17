class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()>=n) {
                if (words[i].substring(0, n).equals(pref))
                    count++;
            }
        }
        return count;
    }
}
