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
//    public boolean isPalindrome(ListNode head) {
//        ListNode temp=head;
//        int cnt=0;
//        while(temp!=null){
//            cnt++;
//            temp=temp.next;
//        }
//        int []arr=new int[cnt];
//        temp=head;
//        int index=0;
//        while(temp!=null){
//            arr[index++]=temp.val;
//            temp=temp.next;
//        }
//        int left=0;
//        int right=arr.length-1;
//        while(left<=right){
//            if(arr[left] != arr[right]){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}