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
    //find mid->
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode mid){
        ListNode prev = null;
        ListNode curr = mid.next;
        mid.next = null;
        ListNode next;
        while(curr!=null){
            next = curr.next ;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
    public void reorderList(ListNode head){
        // step1 -> find mid
        ListNode mid = findMid(head);

        //reverse 2nd half
        ListNode head1 = head;         //leftHead
        ListNode head2 = reverse(mid); //rightHead
        ListNode t1 , t2;

        //zigzag form

        while(head1 != null && head2 != null){
            t1 = head1.next;
            head1.next = head2;
            t2 = head2.next;
            head2.next = t1;

            //update
            head1 = t1;
            head2 = t2;

        }
        
    }
}