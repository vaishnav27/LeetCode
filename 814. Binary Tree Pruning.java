class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root==null)
            return null;
        
        root.left=pruneTree(root.left);
        root.right=pruneTree(root.right);
        
        if(canDeleteNode(root))
            return null;
        return root;
    }
    public boolean canDeleteNode(TreeNode root){
        if(root.left==null && root.right==null && root.val==0)
            return true;
        else
            return false;
    }
}
