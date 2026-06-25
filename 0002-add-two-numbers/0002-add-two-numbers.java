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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode t1 = l1;
        ListNode t2 = l2;

        int carry = 0;

        while (t1 != null || t2 != null) {
            int sum = carry;

            //0+val
            if(t1!=null) sum+=t1.val;
            if(t2!=null) sum+=t2.val;
            
            //create new node //store eg-sum =15 %10 = 5
            ListNode newNode = new ListNode(sum%10);

            //carry 15/10 = 1
            carry = sum/10;

            //join dummy to new 
            temp.next = newNode;
            //update temp to new node
            temp = temp.next;

            //update t1 to next and t2 to next
            //but check bec then can be null

            if(t1!=null) t1= t1.next;
            if(t2!=null) t2=t2.next;

        }

        //if leftover carry
        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            temp.next = newNode;
        }
        return dummy.next;
    }
}