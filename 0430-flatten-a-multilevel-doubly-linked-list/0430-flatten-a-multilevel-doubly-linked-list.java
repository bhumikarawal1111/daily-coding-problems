/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        //base case 
        if(head == null)return head;

        Node curr = head;

        while(curr!=null){

            //valid child exist
            if(curr.child!=null){

                //child node flatten
                Node next = curr.next;
                curr.next = flatten(curr.child);
                curr.next.prev = curr;
                curr.child = null;

                //find tail of child node
                Node tail = curr.next;
                while(tail.next!=null){
                    tail = tail.next;
                }
                //connect tail with next node
                    if(next!=null){
                     tail.next = next;
                     next.prev = tail;   
                    }
            }
            //if valid child not exist
            curr = curr.next;
        }
        return head;
    }
}