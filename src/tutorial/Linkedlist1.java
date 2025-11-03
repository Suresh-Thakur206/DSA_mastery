package tutorial;

class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }

}
public class Linkedlist1 {

    public static void main(String args[]){
        int []arr={2,5,8,9,1};
        Node y=new Node(arr[4],null);
        Node x=new Node(arr[2],y);
        Node z=new Node(arr[1],x);
        System.out.println(x.data);
        System.out.println(z.next);

    }
}
