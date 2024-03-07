import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static ListNode middleNode(ListNode head)
    {
        if(head == null)
        {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
