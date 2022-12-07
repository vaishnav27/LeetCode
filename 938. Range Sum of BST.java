class Solution {
    public int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        dfs(root,low,high);
        return sum;
    }
    public void dfs(TreeNode root,int low,int high){
        if(root!=null){
            if(root.val>=low && root.val<=high){
                sum+=root.val;
            }
            if(root.val>low){
                dfs(root.left,low,high);
            }
            if(root.val<high){
                dfs(root.right,low,high);
            }
        }
    }
}
