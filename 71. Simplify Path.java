

class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        String[] ans = path.split("/");

        for (int i = 0; i < ans.length; i++) {
            if (!st.empty() && ans[i].equals("..")) {
                st.pop();
            } else if (!ans[i].equals(".") && !ans[i].equals("") && !ans[i].equals("..")) {
                st.push(ans[i]);
            }

        }
        List<String> res = new ArrayList<>(st);

        return "/" + String.join("/", res);
    }
}
