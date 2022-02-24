
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

     ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode();
        ListNode ptr = dummyNode;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ptr.next = l1;
                l1 = l1.next;
                ptr = ptr.next;
            } else {
                ptr.next = l2;
                l2 = l2.next;
                ptr = ptr.next;
            }

        }
        if (l1 != null) {
            ptr.next = l1;
        } else {
            ptr.next = l2;
        }
        return dummyNode.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;

        while (head != null && head.next != null) {
            if (midPrev == null) {
                midPrev = head;
            } else {
                midPrev = midPrev.next;
            }
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
