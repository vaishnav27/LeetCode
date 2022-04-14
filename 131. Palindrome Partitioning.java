class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        recr(s, 0, ans, path);
        return ans;
    }

    public void recr(String s, int ind, List<List<String>> ans, List<String> path) {
        if (ind == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = ind; i < s.length(); i++) {
            if (isPalindrome(ind, i, s)) {
                path.add(s.substring(ind, i + 1));
                recr(s, i + 1, ans, path);
                path.remove(path.size() - 1);

            }
        }
    }

    public boolean isPalindrome(int start, int end, String s) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}
