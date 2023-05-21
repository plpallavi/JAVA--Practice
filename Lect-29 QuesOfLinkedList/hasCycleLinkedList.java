import java.util.*;

public class hasCycleLinkedList {
    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }
        ListNode hare = head; // fast
        ListNode tuttle = head; // slow

        while (hare.next != null && hare.next != null) {
            hare = hare.next.next.next;
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
