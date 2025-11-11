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
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//
//        if(head==null ){
//            return null;
//        }
//
//        // counting node
//        int cnt=0;
//        ListNode temp=head;
//        while(temp!=null){
//            cnt++;
//            temp=temp.next;
//        }
//
//        // converting list into array
//        List<Integer> arr=new ArrayList<>();
//        ListNode temp1=head;
//        while(temp1!=null){
//            arr.add(temp1.val);
//            temp1=temp1.next;
//        }
//
//        // removing element
//        int removeIdx=arr.size()-n;
//        if(removeIdx<0 || removeIdx>=arr.size()){
//            return head;
//        }
//
//        arr.remove(removeIdx);
//
//        // converting array to list
//
//        ListNode dummy=new ListNode(0);
//        ListNode curr=dummy;
//        for(int data:arr){
//            curr.next=new ListNode(data);
//            curr=curr.next;
//        }
//        return dummy.next;
//    }
//}