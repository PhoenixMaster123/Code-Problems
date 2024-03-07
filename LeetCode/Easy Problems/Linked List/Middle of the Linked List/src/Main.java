public class Main {
    public static void main(String[] args) {
        // Example usage:
        Solution solution = new Solution();

        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middleNode = Solution.middleNode(head);
        // Print the sublist starting from the middle node until the end
        while (middleNode != null) {
            System.out.print(middleNode.val + " ");
            middleNode = middleNode.next;
        }
    }
}