
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        inorder(root, ans);
        TreeNode res = new TreeNode(0);
        TreeNode curr = res;

        for (int x : ans) {
            curr.right = new TreeNode(x);
            curr = curr.right;
        }
        return res.right;
    }

    public void inorder(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);

    }
}
