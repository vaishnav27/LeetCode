
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList();

        if (root == null) {
            return ans;
        }

        Stack<Node> stack = new Stack<>();
        Stack<Node>stack2=new Stack<>();

        stack.push(root);

        while (!stack.empty()) {
            Node curr = stack.pop();
            stack2.push(curr);

            for(Node child : curr.children){
                stack.push(child);
            }
        }
        
        while(!stack2.empty()){
            ans.add(stack2.pop().val);
        }
        
        
        
        return ans;

    }
}
