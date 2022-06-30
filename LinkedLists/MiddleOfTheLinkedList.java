// Difficulty: Easy
// Technique used: Totoise and hare, or iteration
// Runtime: O(n)

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if( head.next == null ) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while( fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode middleNode2(ListNode head) {
        int length = 0;
        if( head.next == null ) {
            return head;
        }
        ListNode head2 = head;
        ListNode head3 = head;
        while( head2 != null ) {
            length++;
            head2 = head2.next;
        }
            int half = length / 2;
            for( int i = 0 ; i < half; i++ ) {
                head3 = head3.next;
            }
            return head3;
     
    }
}
