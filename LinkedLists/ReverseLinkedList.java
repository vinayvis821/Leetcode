// Difficulty: Easy
// Technique used: While head is not null, reverse
// Runtime: O(n)


public class ReverseLinkedList {
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while( head != null ) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
