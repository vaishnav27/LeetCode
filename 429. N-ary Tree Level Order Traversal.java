class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            while (size-- > 0) {
                Node head = q.poll();
                list.add(head.val);
                for (Node child : head.children) {
                    q.offer(child);
                }
            }
            ans.add(list);

        }
        return ans;
    }
}
