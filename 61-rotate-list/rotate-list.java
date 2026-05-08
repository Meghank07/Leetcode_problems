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
    public ListNode rotateRight(ListNode head, int k) {
          if(head == null || head.next == null || k==0) return head;
          int count = 1;
          ListNode dummy = head;
          while(dummy.next!=null){
              
              dummy = dummy.next;
              count++;
          }
          dummy.next = head;
          k  =  k % count;
          int length = count - k;

          ListNode newHead = dummy;
          while(length > 0){
              newHead = newHead.next;
              length--;
              
          }
          ListNode ans = newHead.next;
          newHead.next = null;  
          return ans;

    }
}