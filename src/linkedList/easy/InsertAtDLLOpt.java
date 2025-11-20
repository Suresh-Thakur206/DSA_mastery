//Insertion at doubly linked list
// Optimal solution

/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        if(head==null){
            return null;
        }
        Node temp=head;
        Node tail=head;
        tail=tail.next;
        int  index=0;
        while(temp!=null){
            if(index==p && tail==null){
                Node newNode=new Node(x);

                temp.next=newNode;
                newNode.prev=temp;
                break;
            }
            if(index==p && tail!=null){
                Node newNode=new Node(x);
                temp.next=newNode;
                newNode.prev=temp;
                newNode.next=tail;
                tail.prev=newNode;
                break;
            }

            index++;
            tail=tail.next;
            temp=temp.next;

        }
        return head;
    }
}