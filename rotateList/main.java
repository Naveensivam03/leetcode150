import jdk.internal.classfile.components.ClassPrinter.ListNode;

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
  public ListNode rotateRight(ListNode head, int k) {
      

    //1 -> 2 -> 3 -> 4 -> 5
    //k=2
    //find the last 
    //connect it with first
    //5 - 2 = 3;
    //
    //
    if (head==null || head.next ==null ||k==0) {
      return head;
    }


    ListNode curr = head;
    int leng =1;
    while (curr.next != null) {
        curr = curr.next;
        leng+=1;
    }     
    //take the last node's next into first
    curr.next = head;
    //get to the before of the startindex after rotate
    int remain = leng - (k%leng);
    for(int i =0; i<remain ; i++){
      curr = curr.next;
    }
    ListNode start = curr.next;
    curr.next = null;
    return start;
  }

  
}
