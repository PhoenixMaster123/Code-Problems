class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        int length = 0;
        ListNode temp = head;

        while(temp != null)
        {
            length++;
            temp = temp.next;
        }

        temp = head;
        ListNode prev = null;
        int position = length - n;

        if(position == 0)
        {
            return head.next;
        }

        for(int i = 0; i < position; i++)
        {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;

        temp = null;

        return head;
    }
}