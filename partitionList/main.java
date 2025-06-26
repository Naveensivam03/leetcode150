/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode firstLeft = left;
        ListNode right = new ListNode(0);
        ListNode firstRight = right;
        ListNode curr = head;
        while (curr!=null){
          if (curr.val < key){
            left.next = curr;
            left = left.next;
          }else{
            right.next = curr;
            right = right.next;
          }
          curr = curr.next;
        }
        right.next = null;
        left.next = firstRight.next;
        firstRight.next = null;
        return firstLeft.next;
    }
}
