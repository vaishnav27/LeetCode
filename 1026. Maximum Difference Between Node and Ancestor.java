class Solution {
    int result=0;
    public void helper(TreeNode root,int currMax,int currMin){
        if(root==null)
            return ;
        int possibleResult=Math.max(Math.abs(currMax-root.val),Math.abs(currMin-root.val));
        result=Math.max(possibleResult,result);

        currMax=Math.max(currMax,root.val);
        currMin=Math.min(currMin,root.val);

        helper(root.left,currMax,currMin);
        helper(root.right,currMax,currMin);
    }
    public int maxAncestorDiff(TreeNode root) {
        if(root==null)
            return 0;
        result=0;    
        helper(root,root.val,root.val);
        return result;
    }
}
