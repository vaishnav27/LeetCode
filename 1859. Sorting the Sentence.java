class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] ans = new String[str.length];
        int i = 0;
        for (String word : str) {
            i = (int) (word.charAt(word.length() - 1) - '0');

            ans[i - 1] = word.substring(0, word.length() - 1);

        }
        StringBuilder sb = new StringBuilder();

        for (i = 0; i < ans.length-1; i++) {
            sb.append(ans[i]).append(" ");
        }
        sb.append(ans[i]);
        return sb.toString();

    }
}
