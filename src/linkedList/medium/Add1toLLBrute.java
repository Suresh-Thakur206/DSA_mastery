// Add 1 to a Linked List Number
// Brute Force Solution

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
    public Node addOne(Node head) {
        if(head==null){
            return null;
        }
        // code here.
        // reversing linkedlist

        Node curr=head;
        Node temp=null;
        Node prev=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        // adding 1 to the node
        Node reverseHead=prev;
        temp=reverseHead;
        int carry=1;
        while(temp!=null){
            temp.data=temp.data+carry;
            if(temp.data<10){
                carry=0;
                break;
            }else{
                temp.data=0;
                carry=1;
            }
            temp=temp.next;
        }

        // printing LL
        if(carry==1){
            Node newNode=new Node(1);
            newNode.next=reverseHead;
            reverseHead=newNode;
            return reverseHead;

        }

        curr=reverseHead;
        temp=null;
        prev=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }
}