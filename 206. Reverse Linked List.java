class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev=null;
        ListNode curr=head;
        ListNode nextptr;

        while (curr != null) {
            nextptr = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextptr;

        }
        return prev;
        
    }
}
