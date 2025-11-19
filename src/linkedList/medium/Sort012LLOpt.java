///*
//
//
//class Node {
//    int data;
//    Node next;
//
//    Node(int d)
//    {
//        data = d;
//        next = null;
//    }
//}*/
//
//class Solution {
//    public Node segregate(Node head) {
//        // code here
//        return mergSort(head);
//
//    }
//    public Node mergSort(Node head){
//        if(head==null || head.next==null){
//            return head;
//        }
//        Node fast=head;
//        Node slow =head;
//        Node prev=null;
//        while(fast!=null && fast.next!=null){
//            prev=slow;
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        prev.next=null;
//        Node head1=mergSort(head);
//        Node head2=mergSort(slow);
//        Node ansMerg=merg(head1,head2);
//        return ansMerg;
//
//    }
//    // Merging List
//    public Node merg(Node head1,Node head2){
//        Node dummy=new Node(-1);
//        Node temp=dummy;
//        while(head1!=null && head2!=null){
//            if(head1.data<=head2.data){
//                temp.next=head1;
//                head1=head1.next;
//            }else{
//                temp.next=head2;
//                head2=head2.next;
//            }
//            temp=temp.next;
//        }
//
//        if(head1!=null){
//            temp.next=head1;
//            head1=head1.next;
//            temp=temp.next;
//        }
//        if(head2!=null){
//            temp.next=head2;
//            head2=head2.next;
//            temp=temp.next;
//        }
//        return dummy.next;
//    }
//}