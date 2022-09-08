class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return helper(root,0);
    }
    public int helper(TreeNode root,int sum){
        if(root==null)
            return 0;
        sum=(sum << 1)+root.val;
        
        if(root.left==null && root.right==null)
            return sum;
        
        return helper(root.left,sum)+helper(root.right,sum);
    }
}
