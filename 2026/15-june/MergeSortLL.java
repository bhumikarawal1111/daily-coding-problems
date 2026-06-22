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

// time complexity - O(nlogn)
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

    //merge two sorted ll ->
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode t1 = head1;
        ListNode t2 = head2;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(t1!=null && t2!=null){
            if(t1.val < t2.val){
                temp.next = t1;
                temp =t1;
                t1= t1.next;
            }
            else{
                temp.next = t2;
                temp =t2;
                t2= t2.next;
            }
        }
        if(t1!=null){
            temp.next =t1;
        }
        else{
            temp.next = t2;
        }
        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        //corner case
        if(head ==null || head.next ==null){
            return head;
        }

        //step1 -> mind mid of ll ->
        ListNode mid = findMid(head);

        //step2 2-> left and right MS->
        ListNode rightHalf = mid.next;
        mid.next = null;

        ListNode newLeft = sortList(head);
        ListNode newRight = sortList(rightHalf);

        //step3-> merge

        return merge(newLeft, newRight);
        
    }
}
