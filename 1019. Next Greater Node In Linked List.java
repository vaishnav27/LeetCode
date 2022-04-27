class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int[] ans = new int[list.size()];
    
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < list.size(); i++) {
            while (!st.isEmpty() && list.get(st.peek()) < list.get(i)) {
                ans[st.pop()] = list.get(i);
            }
            st.push(i);
        }
        return ans;
    }
}
