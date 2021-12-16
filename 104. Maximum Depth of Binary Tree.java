//Recursive Approach

class Solution {
        public int maxDepth(TreeNode root) {
            
            if(root==null)
                return 0;
            
            int left_height =maxDepth(root.left);
            int right_height=maxDepth(root.right);
            
            return 1+Math.max(left_height,right_height);
        }
}

//Iterative Approach
class Solution {
        public int maxDepth(TreeNode root) {
          if(root == null) {
            return 0;
    }
    
    Stack<TreeNode> stack = new Stack<>();
    Stack<Integer> value = new Stack<>();
    stack.push(root);
    value.push(1);
    int max = 0;
    while(!stack.isEmpty()) {
        TreeNode node = stack.pop();
        int temp = value.pop();
        max = Math.max(temp, max);
        if(node.left != null) {
            stack.push(node.left);
            value.push(temp+1);
        }
        if(node.right != null) {
            stack.push(node.right);
            value.push(temp+1);
        }
    }
    return max;

    }
}
