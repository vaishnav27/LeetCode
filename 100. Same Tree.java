class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        else if(p==null || q==null)
            return false;
        
        Queue<TreeNode>queue=new LinkedList<>();
        
        queue.offer(p);
        queue.offer(q);
        
        while(!queue.isEmpty()){
            TreeNode first=queue.poll();
            TreeNode second=queue.poll();
            
            if(first==null && second==null)
                continue;
            if(first==null || second==null)
                return false;
            if(first.val!=second.val)
                return false;
            queue.offer(first.left);
            queue.offer(second.left);
            queue.offer(first.right);
            queue.offer(second.right);
            
        }
        return true;
    }
}
