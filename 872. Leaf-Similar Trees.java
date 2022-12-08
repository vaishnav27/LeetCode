class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>leaves1=new ArrayList<>();
        List<Integer>leaves2=new ArrayList<>();

        dfs(root1,leaves1);
        dfs(root2,leaves2);        

        return leaves1.equals(leaves2);
    }
    public void dfs(TreeNode root,List<Integer>leafValues){
        if(root!=null){
            if(root.left==null && root.right==null){
                leafValues.add(root.val);
            }
            dfs(root.left,leafValues);
            dfs(root.right,leafValues);
        }
    }
}
