
class Solution {
    public String reversePrefix(String word, char ch) {

        char[] ans = new char[word.length()];
        int x = 0;
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)) {
                x = i;
                break;
            }
        }
        char[] c=word.toCharArray();
        
        for (int i = 0; i <=x; i++) {
            ans[i]=c[x-i];
        }
        for (int i = x+1; i < word.length(); i++) {
            ans[i]=c[i];
        }
        return String.valueOf(ans);

    }
}
