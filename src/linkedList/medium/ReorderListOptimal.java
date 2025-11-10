///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public void reorderList(ListNode head) {
//        if(head==null || head.next==null || head.next.next==null){
//            return;
//        }
//        ListNode fast=head;
//        ListNode slow=head;
//        while(fast.next!=null && fast.next.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//
//        ListNode secHead=slow.next;
//        // detach ll
//        slow.next=null;
//
//        ListNode curr=secHead;
//        ListNode prev=null;
//        while(curr!=null){
//            ListNode temp=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=temp;
//        }
//
//        // merging
//
//        ListNode t1=head;
//        ListNode t2=prev;
//        while(t2!=null){
//            ListNode m1=t1.next;
//            ListNode m2=t2.next;
//            t1.next=t2;
//            t2.next=m1;
//            t1=m1;
//            t2=m2;
//        }
//    }
//}