class Solution {
    public int getDecimalValue(ListNode head) {
//         if (head == null)
//             return 0;
//         String s = "";
//         while (head!= null) {
//             s += head.val;
//             head=head.next;
//         }
//         int dec = Integer.parseInt(s,2);

//         return dec;
//     }
        
        int num=head.val;
        
        while(head.next!=null){
            num=num*2+head.next.val;
            head=head.next;
        }
        return num;
}
}
