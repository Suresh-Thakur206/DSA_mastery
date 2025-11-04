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

    //lengthh of linkedlist
    public static int lengthLL(Node1 head){
        int cnt=0;
        Node1 temp=head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
    // serching
    public static int checkLL(Node1 head,int value){
        Node1 temp=head;
        while(temp!=null){
            if(temp.data==value){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int []arr={12,5,6,8,7,9};
        Node1 head=converArr2LL(arr);
       // System.out.println(lengthLL(head));
        System.out.println(checkLL(head,3));

}
}
