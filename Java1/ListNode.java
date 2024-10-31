public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = next;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode temp = current.next; // temp variable to reference the next node in the list i.e temp points to 2
                                          // while first node(1) points to prev(null)
            current.next = prev;
            prev = current; // prev points to the first node in the linked list so that in the next
                            // iteration the second node points to the first node in the reverse direction
            current = temp;
        }
        return prev;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {

            if (current.next == null) {
                System.out.print(current.val);
            } else {
                System.out.print(current.val + "->");
            }

            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.println("Original Linked List: ");
        printLinkedList(head);

        ListNode reversedList = reverseList(head);
        System.out.println("Reversed Linked List: ");
        printLinkedList(reversedList);
    }
}
