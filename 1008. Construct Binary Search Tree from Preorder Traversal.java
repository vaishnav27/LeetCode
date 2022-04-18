
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildBST(preorder, Integer.MAX_VALUE, new int[] { 0 });
    }

    public TreeNode buildBST(int[] arr, int bound, int[] i) {
        if (i[0] == arr.length || arr[i[0]] > bound)
            return null;
        TreeNode node = new TreeNode(arr[i[0]++]);
        node.left = buildBST(arr, node.val, i);
        node.right = buildBST(arr, bound, i);
        return node;
    }
}
