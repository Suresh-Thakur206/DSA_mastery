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
//    public ListNode sortList(ListNode head) {
//        if(head==null || head.next==null){
//            return head;
//        }
//        ListNode temp=head;
//        int cnt=0;
//        while(temp!=null){
//            cnt++;
//            temp=temp.next;
//        }
//        int []arr=new int [cnt];
//        temp=head;
//        int index=0;
//        while(temp!=null){
//            arr[index++]=temp.val;
//            temp=temp.next;
//        }
//        // sorting data
//        Arrays.sort(arr);
//        ListNode dummy =new ListNode(0);
//        ListNode curr=dummy;
//        for(int num:arr){
//            curr.next=new ListNode(num);
//            curr=curr.next;
//
//        }
//        return dummy.next;
//
//    }
//}