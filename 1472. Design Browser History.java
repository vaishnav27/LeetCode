
class BrowserHistory {

    Stack<String> backward_History;
    Stack<String> forward_History;

    public BrowserHistory(String homepage) {
        backward_History = new Stack<>();
        backward_History.push(homepage);
        forward_History = new Stack<>();

    }

    public void visit(String url) {
        backward_History.push(url);
        forward_History = new Stack<>();

    }

    public String back(int steps) {
        while (steps-- > 0 && backward_History.size() > 1) {
            forward_History.push(backward_History.peek());
            backward_History.pop();

        }
        return backward_History.peek();
    }

    public String forward(int steps) {
        while (steps-- > 0 && forward_History.size()>0) {
            backward_History.push(forward_History.peek());
            forward_History.pop();
        }
        return backward_History.peek();
    }
}
