// Delete in a Doubly Linked List
// Optimal Solution

/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        if(head==null || head.next==null){
            return null;
        }

        Node temp=head;
        Node tail=head;
        tail=tail.next;
        Node back=null;

        if(x==1){
            head.next=null;
            head=tail;
            tail.prev=null;
            return head;
        }
        int index=1;
        while(temp!=null){
            if(index==x && tail==null){
                temp.next=null;
                back.next=tail;
                break;
            }
            if(index==x && tail!=null){
                temp.next=null;
                back.next=tail;
                tail.prev=back;
                break;
            }
            index++;
            back=temp;
            temp=temp.next;
            tail=tail.next;

        }
        return head;
    }
}