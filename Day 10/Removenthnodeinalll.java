class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt=0;
        ListNode temp=head;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        if(cnt==n) {
            ListNode newhead=head.next;
            return newhead;
        }else
        {
            temp=head;
            int res=cnt-n;
            while(temp!=null)
            {
                res--;
                if(res==0)  break;
                temp=temp.next;
            }
            ListNode deletelist=temp.next;
            temp.next=temp.next.next;
            return head;
        }
    }
}