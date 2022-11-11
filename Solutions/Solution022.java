public class Solution022 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head, fast = head;
        while (true) {
            if (slow != null) {
                slow = slow.next;
            } else {
                return null;
            }
            if (fast != null && fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (slow == fast) break;
        }
        ListNode node = head;
        while (node != slow) {
            node = node.next;
            slow = slow.next;
        }
        return node;
    }
}
