// Remove duplicates from a sorted doubly linked list
// Optimal Solution
/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        Node back=head;
        temp=temp.next;
        while(temp!=null){
            if(temp.data==back.data){

                Node tempNext=temp.next;
                back.next=tempNext;
                if(tempNext!=null){
                    tempNext.prev=back;
                }
                temp=tempNext;


            }

            else{
                back=temp;
                temp=temp.next;
            }

        }
        return head;
    }
}