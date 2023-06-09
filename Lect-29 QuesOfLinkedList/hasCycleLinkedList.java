import java.util.*;
// Finding a linked is in cycle or not

public class hasCycleLinkedList {
    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }
        ListNode hare = head; // fast
        ListNode turtle = head; // slow

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }

            return false;
        }
    }

    public static void main(String[] args) {

    }
}
