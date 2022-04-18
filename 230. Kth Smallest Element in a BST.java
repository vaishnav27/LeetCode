class Solution {
    public int kthSmallest(TreeNode root, int k) {
        return solve(root,k);
    }
    public int solve(TreeNode root,int k){
        if(root==null)return 0;
        
        int left=solve(root.left,k);
        
        if(left!=0)return left;
        
        k-=1;
        
        if(k==0){
            return root.val;
        }
        int right=solve(root.right,k);
        return right;
    }
}

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans.get(k - 1);
    }

    public List<Integer> inorder(TreeNode root, List<Integer> arr) {
        if (root == null)
            return arr;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
                
        return arr;

    }

}
