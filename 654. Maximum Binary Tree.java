
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return constructTree(nums, 0, nums.length);
    }

    public TreeNode constructTree(int[] nums, int l, int r) {
        if (l == r)
            return null;
        int maximum = max(nums, l, r);

        TreeNode root = new TreeNode(nums[maximum]);
        root.left = constructTree(nums, l, maximum);
        root.right = constructTree(nums, maximum + 1, r);

        return root;

    }

    public int max(int[] nums, int l, int r) {
        int maximum = l;

        for (int i = l; i < r; i++) {
            if (nums[maximum] < nums[i])
                maximum = i;
        }
        return maximum;
    }
}
