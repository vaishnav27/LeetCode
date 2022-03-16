
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }
        Stack<Node> st = new Stack<>();

        st.push(root);

        while (!st.empty()) {
            Node curr = st.pop();
            ans.add(curr.val);

            for (int i = curr.children.size() - 1; i >= 0; i--) {
                st.push(curr.children.get(i));
            }
        }
        return ans;
    }
}
