package tutorial;

class Node4{
    int data;
    Node4 next;

    Node4(int data){
        this.data=data;
        this.next=null;
    }
    Node4(int data,Node4 next){
        this.data=data;
        this.next=next;
    }
}
public class LinkeList4 {
    public static Node4 arrayToLL(int[]arr){
        Node4 head=new Node4(arr[0]);
        Node4 mover=head;
        for(int i=1;i<arr.length;i++){
            Node4 temp=new Node4(arr[i]);
            mover.next=temp;
            mover=temp;

        }
        return head;

    }
    // adding new head
    public static Node4 newHead(Node4 head,int value){
        Node4 temp=new Node4(value,head);
        return temp;
    }
    // adding last element to the linkedlist
    public static Node4 addLast(Node4 head,int value){
        if(head==null){
            return new Node4(value);
        }
        Node4 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node4 lastNode=new Node4(value);
        temp.next=lastNode;
        return head;
    }
    // adding element at kth position

    public static Node4 addKth(Node4 head, int element, int k){
        if(head==null){
            if(k==1){
                return new Node4(element );
            }else{
                return head;
            }
        }

        if(k==1){
            return new Node4(element,head);
        }

        int cnt=0;
        Node4 temp=head;
        while(temp!=null){
            cnt++;
            if(cnt==k-1){
                Node4 insertNode=new Node4(element);
                insertNode.next=temp.next;
                temp.next=insertNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    // insert element before value


    public static Node4 insertValue(Node4 head, int element, int value){
        if(head==null){
            return null;
        }

        if(head.data==value){
            Node4 headNode=new Node4(element,head);
            return headNode;

        }
        Node4 temp=head;
        while(temp.next!=null){

            if(temp.next.data==value){
                Node4 insertNode=new Node4(element);
                insertNode.next=temp.next;
                temp.next=insertNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    // printing list
    public static void printList(Node4 head){
        Node4 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
       int []arr={2,3,4,5,6};
      Node4 head=arrayToLL(arr);
      // printList(head);
      //head=newHead(head,9);
      //printList(head);
        //head=addLast(head,22);
        //printList(head);

//        head=addKth(head,100,0);
//        printList(head);

        head=insertValue(head,99,2);
        printList(head);



    }




}
