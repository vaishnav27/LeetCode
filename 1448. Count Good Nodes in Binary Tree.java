class Solution {
    int count;
    public int goodNodes(TreeNode root) {
        goodNodesCount(root, Integer.MIN_VALUE);
        return count;
    }

    public void goodNodesCount(TreeNode root, int maxValue) {
        if (root == null)
            return;

        if (root.val >= maxValue) {
            count++;
        }
        goodNodesCount(root.left, Math.max(root.val, maxValue));
        goodNodesCount(root.right, Math.max(root.val, maxValue));
        
        return;
    }
}
