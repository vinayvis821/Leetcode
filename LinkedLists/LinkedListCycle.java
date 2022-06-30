// Difficulty: Easy
// Technique used: Totoise and hare, or hashset
// Runtime: O(n)


public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if( head == null || head.next == null ) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while( fast != null && fast.next != null) {
            if( slow == fast ) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if( head == null ) {
            return false;
        }
        if( head.next == null ) {
            return false;
        }
        HashSet<ListNode> set = new HashSet<ListNode>();
        while( head != null ) {
            boolean value = set.add(head);
            if( !value ) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
