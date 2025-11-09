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
//    public ListNode reverseList(ListNode head) {
//        // counting the number of node
//        if(head==null){
//            return null;
//        }
//
//
//        ListNode temp=head;
//        int cnt=0;
//        while(temp!=null){
//            cnt++;
//            temp=temp.next;
//        }
//        // creating arra;
//        int []arr=new int[cnt];
//        // converting list to node
//        ListNode temp2=head;
//        int index=0;
//        while(temp2!=null){
//            arr[index++]=temp2.val;
//
//            temp2=temp2.next;
//        }
//
//        // reversing the array;
//        int left=0;
//        int right=arr.length-1;
//        while(left<right){
//            int temp3=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp3;
//            left++;
//            right--;
//        }
//        // converting array to list;
//
//        ListNode newHead=new ListNode(arr[0]);
//        ListNode curr=newHead;
//        for(int i=1;i<arr.length;i++){
//            curr.next=new ListNode(arr[i]);
//            curr=curr.next;
//
//        }
//        return newHead;
//
//    }
//}