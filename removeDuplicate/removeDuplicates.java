/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode curr = head;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;
    while (curr != null && curr.next != null) {
      if (curr.next != null && curr.val == curr.next.val) {
        int temp = curr.val;
        while (curr != null && curr.val == temp) {
          curr = curr.next;
        }
        prev.next = curr;

      } else {
        prev = prev.next;
        curr = curr.next;

    }
    return dummy.next;
  }
}
