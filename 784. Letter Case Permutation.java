class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();

        backTrack(0, ans, s.toCharArray());
        
        return ans;
    }

    public void backTrack(int ind, List<String> ans, char[] ch) {
        if (ind == ch.length) {
            ans.add(new String(ch));
        } else if (Character.isLetter(ch[ind])) {
            ch[ind] = Character.toUpperCase(ch[ind]);
            backTrack(ind + 1, ans, ch);
            ch[ind] = Character.toLowerCase(ch[ind]);
            backTrack(ind+1, ans, ch);
        } else {
            backTrack(ind+1, ans, ch);
        }
    }
}
