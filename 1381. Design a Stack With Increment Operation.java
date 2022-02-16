
class CustomStack {

    int[] ans;
    Stack<Integer> stack;
    int n;

    public CustomStack(int maxSize) {
        n = maxSize;
        stack = new Stack<>();
        ans = new int[n];
    }

    public void push(int x) {

        if (stack.size() < n) {
            stack.push(x);
        }

    }

    public int pop() {
        int i = stack.size() - 1;
      

        if (i < 0)
            return -1;
        if (i > 0) {
            ans[i - 1] += ans[i];
          
        }

        int res = stack.pop() + ans[i];
        System.out.println(res);
        
        ans[i] = 0;
        return res;

    }

    public void increment(int k, int val) {
        int i = Math.min(k, stack.size()) - 1;
        if (i >= 0)
            ans[i] += val;
    }
}
