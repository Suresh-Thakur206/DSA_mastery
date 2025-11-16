///*
//class Node {
//    int data;
//    Node next;
//
//    Node(int x) {
//        data = x;
//        next = null;
//    }
//}
//*/
//
//class Solution {
//    public int lengthOfLoop(Node head) {
//
//        Node fast=head;
//        Node slow=head;
//        while(fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if(slow==fast){
//                break;
//
//            }
//        }
//        if(fast==null || fast.next==null){
//            return 0;
//        }
//        int count=1;
//        while(fast.next!=slow){
//            fast=fast.next;
//            count++;
//        }
//        return count;
//    }
//}