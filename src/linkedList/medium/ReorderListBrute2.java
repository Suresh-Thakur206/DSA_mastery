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
//        ListNode temp=head;
//        // counting total node;
//        int cnt=0;
//        while(temp!=null){
//            cnt=cnt+1;
//            temp=temp.next;
//        }
//
//        // converting linkedlist into array
//        int []arr=new int[cnt];
//        ListNode temp1=head.next;
//        arr[0]=head.val;
//        for(int i=1;i<arr.length;i++){
//            arr[i]=temp1.val;
//            temp1=temp1.next;
//        }
//
//        // converting array into linkedList
//
//        int left=0;
//        int right=arr.length-1;
//        boolean ischeckLeft=true;
//
//        ListNode temp2=head;
//        while(temp2!=null){
//            if(ischeckLeft){
//                temp2.val=arr[left++];
//            }else{
//                temp2.val=arr[right--];
//            }
//            ischeckLeft=!ischeckLeft;
//            temp2=temp2.next;
//        }
//
//
//
//    }
//}