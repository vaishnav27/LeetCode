class Solution {
    public  int camera = 0;

    public int minCameraCover(TreeNode root) {
        if (needCamera(root) == -1) {
            camera++;
        }
        return camera;
    }

    public int needCamera(TreeNode root) {
        if (root == null)
            return 1;
        int left_child = needCamera(root.left);
        int right_child = needCamera(root.right);

        if (left_child == -1||right_child == -1) {
            camera++;
            return 0;
        }

        if (left_child == 0 || right_child == 0 )
            return 1;

        return -1;
    }
}
