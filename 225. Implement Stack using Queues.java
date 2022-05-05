class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    private int top;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.offer(x);
        top = x;
    }

    public int pop() {
        while (q1.size() > 1) {
            top=q1.poll();
            q2.offer(top);
            
        }
        int popped=q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return popped;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
