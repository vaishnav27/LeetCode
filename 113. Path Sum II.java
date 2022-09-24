import java.util.*;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();

        pathSumHelper(root, targetSum, ans, ls);
    }

    public void pathSumHelper(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> ls) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                List<Integer> ds = new ArrayList<>(ls);
                ds.add(root.val);
                ans.add(ds);
            }
            return;
        }
        
        ls.add(root.val);
        pathSumHelper(root.left, targetSum - root.val, ans, ls);
        pathSumHelper(root.right, targetSum - root.val, ans, ls);

        ls.remove(ls.size() - 1);
    }
}
