import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original linked list
        System.out.println("Original linked list:");
        printList(head);

        // Reverse the linked list
        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);

        // Print the reversed linked list
        System.out.println("Reversed linked list:");
        printList(reversedHead);
    }

    // Utility method to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
