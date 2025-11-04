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

    // printing list
    public static void printList(Node3 head){
        Node3 temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        int []arr={3,7,9,1,8,7};
        Node3 head=conArrToLL(arr);
        //System.out.println(head.data);
       // System.out.println("printing list");
       // printList(head);

       head=deletHead(head);
       printList(head);
    }
}
