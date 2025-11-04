package tutorial;

class Node1{
    int data;
    Node1 next;

    Node1(int data1,Node1 next1){
        this.data=data1;
        this.next=next1;
    }
    Node1(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class Linkedlist2 {
    public static Node1 converArr2LL(int []arr){
        Node1 head=new Node1(arr[0]);
        Node1 mover =head;

        for(int i=1;i<arr.length;i++){
            Node1 temp=new Node1(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int []arr={12,5,6,8};
        Node1 head=converArr2LL(arr);
        System.out.println(head.data);
    }
}
