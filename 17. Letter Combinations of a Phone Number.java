class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0)
            return ans;

        HashMap<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wyxz");

        backtrack(digits, map, 0,  ans, new StringBuilder());

        return ans;

    }

    public void backtrack(String digits, HashMap<Character, String> map, int ind, List<String> ans,
            StringBuilder sb) {
        if (ind == digits.length()) {
            ans.add((sb.toString()));
            return;
        }

        String curr = map.get(digits.charAt(ind));

        for (int i = 0; i < curr.length(); i++) {
            sb.append(curr.charAt(i));
            backtrack(digits, map, ind + 1, ans, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
