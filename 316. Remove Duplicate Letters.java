class Solution {
    public String removeDuplicateLetters(String s) {
        int[] ans = new int[26];
        boolean[] visited = new boolean[26];

        for (char ch : s.toCharArray()) {
            ans[ch - 'a']++;
        }

        Stack<Character> st = new Stack<>();

        int i;
        for (char c : s.toCharArray()) {
            i = c - 'a';
            ans[i]--;

            if (visited[i])
                continue;

            while (!st.empty() && c < st.peek() && ans[st.peek() - 'a'] != 0) {
                visited[st.pop() - 'a'] = false;
            }
            st.push(c);
            visited[i] = true;
        }
        StringBuilder sb = new StringBuilder();

        while (!st.empty()) {
            sb.insert(0, st.pop());
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Solution x = new Solution();
        String s = "bcabc";
        System.out.println(x.removeDuplicateLetters(s));
    }
}
