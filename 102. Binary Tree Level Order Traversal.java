
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> sublist = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                sublist.add(q.poll().val);

            }
            ans.add(sublist);
        }
        return ans;

    }
}
