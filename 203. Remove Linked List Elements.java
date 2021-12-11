class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }
        
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode curr = dummyNode;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummyNode.next;
    }
}
