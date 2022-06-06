class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> inMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        TreeNode root = build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, inMap);

        return root;
    }

    public TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int preStart, int preEnd,
            HashMap<Integer, Integer> inMap) {

        if (preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(postorder[preEnd]);

        int inRoot = inMap.get(postorder[preEnd]);
        int numsleft = inRoot - inStart;

        root.left = build(inorder, inStart, inRoot - 1, postorder, preStart, preStart + numsleft - 1, inMap);
        root.right = build(inorder, inRoot + 1, inEnd, postorder, preStart + numsleft, preEnd - 1,
                inMap);

        return root;
    }
}
