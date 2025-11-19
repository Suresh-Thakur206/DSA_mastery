//Add 1 to a Linked List Number
// Optimal Solution (recursion)

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int addHelper(Node temp){
        if(temp==null){
            return 1;
        }
        int carry=addHelper(temp.next);
        temp.data=temp.data+carry;
        if(temp.data<10){
            return 0;
        }
        temp.data=0;
        return 1;
    }
    public Node addOne(Node head) {
        int carry=addHelper(head);
        if(carry==1){
            Node newHead=new Node(1);
            newHead.next=head;
            head=newHead;
        }
        return head;

    }
}