
class StockSpanner {
    Stack<Node> st;
     static class Node {
        int val;
        int index;

        Node(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int count = 0;

        while (!st.isEmpty() && st.peek().val <= price) {
            count += st.peek().index;
            st.pop();
        }
        count++;
        st.push(new Node(price, count));
        return count;
    }

   
}
