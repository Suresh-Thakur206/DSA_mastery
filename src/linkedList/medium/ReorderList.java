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
//        // manupulating data
//        int []newArr=new int[cnt];
//        int left=0;
//        int right=arr.length-1;
//        int index=0;
//        while(left<=right){
//            if(index%2==0){
//                newArr[index]=arr[left];
//                left=left+1;
//                index++;
//
//            }else{
//                newArr[index]=arr[right];
//                right=right-1;
//                index++;
//            }
//        }
//
//        // converting arr into linkedlist
//
//        ListNode temp2=head;
//        for(int i=0;i<arr.length;i++){
//            temp2.val=newArr[i];
//            temp2=temp2.next;
//        }
//
//    }
//}