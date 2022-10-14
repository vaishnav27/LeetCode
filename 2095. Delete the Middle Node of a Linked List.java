class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        
        ListNode copyNode = head;
        int count = countOfNode(head);
        int mid = count / 2;

        while (mid-- > 1) {
            head = head.next;
        }
        head.next = head.next.next;

        return copyNode;

    }

    public int countOfNode(ListNode head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
