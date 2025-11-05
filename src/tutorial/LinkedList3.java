package tutorial;

class Node3{
    int data;
    Node3 next;
    Node3(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class LinkedList3 {
    public static Node3 conArrToLL(int[]arr){
        Node3 head=new Node3(arr[0]);
        Node3 mover =head;
        for(int i=1;i<arr.length;i++){
            Node3 temp=new Node3(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    // deleting head;
    public static Node3 deletHead(Node3 head){
        if(head==null){
            return null;
        }
        Node3 temp=head;
        head=temp.next;
        return head;

    }
    // deleting tail
    public static Node3 removeTail(Node3 head){
        Node3 tail=head;
        if(tail==null ||tail.next==null){
            return null;
        }
        while(tail.next.next!=null){
            tail=tail.next;
        }
        tail.next=null;
        return head;
    }
    // deleting kth node
    public static Node3 removeKth(Node3 head,int k){
        if(head==null) return null;
        if(k==1){

            head=head.next;
            return head;
        }
        int cnt=0;
        Node3 temp=head;
        Node3 prev=null;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;

        }
        return head;
    }

    // deleting the from the value of linkedlist

    public static Node3 removeValue(Node3 head,int element){
        if(head==null) return null;
        if(head.data==element){
            head=head.next;
            return head;
        }

        Node3 temp=head;
        Node3 prev=null;
        while(temp!=null){
            if(temp.data==element){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;

        }
        return head;
    }

    // printing list
    public static void printList(Node3 head){
        Node3 temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        int []arr={3,7,9,11,17};
        Node3 head=conArrToLL(arr);
        //System.out.println(head.data);
       // System.out.println("printing list");
       // printList(head);

       //head=deletHead(head);
       //printList(head);
        //head=removeTail(head);
        //printList(head);

       // head=removeKth(head,5);
       // printList(head);
        head=removeValue(head,3);
        printList(head);
    }
}
