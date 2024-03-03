public class Main {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        // Remove the 2nd node from the end
        Solution solution = new Solution();
        ListNode result = solution.removeNthFromEnd(listNode, 2);

        // Print the resulting linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}