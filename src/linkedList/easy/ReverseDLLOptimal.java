
//Reverse a Doubly Linked List
// Optimal Solution



/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node curr=head;

        Node back=null;
        while(curr!=null){
            Node currNext=curr.next;
            curr.next=back;
            back=curr;
            curr=currNext;
        }
        return back;
    }
}