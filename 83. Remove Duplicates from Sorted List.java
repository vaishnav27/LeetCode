class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;

        if (head==null || head.next==null) {
            return head;
        } else {
            while (temp.next != null) {
                if (temp.val != temp.next.val) {
                    temp = temp.next;
                } else {
                    temp = temp.next.next;
                }
            }
        }
        return head;
    }
}
