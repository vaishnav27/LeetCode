
class Solution {
    public TreeNode bstToGst(TreeNode root) {
        Stack<TreeNode>st=new Stack<TreeNode>();
        TreeNode curr=root;
        int sum=0;
        
        while(!st.isEmpty() || curr!=null){
            while(curr!=null){
                st.add(curr);
                curr=curr.right;
            }
            curr=st.pop();
            sum+=curr.val;
            curr.val=sum;
            
             curr=curr.left;
        }
      
        return root;
    }
}
