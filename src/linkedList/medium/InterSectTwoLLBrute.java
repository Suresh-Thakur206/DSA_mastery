
//160. Intersection of Two Linked Lists
// Brute Force Solution

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode curr=headA;
        HashSet<ListNode> check=new HashSet<>();
        while(curr!=null){
            check.add(curr);
            curr=curr.next;
        }

        curr=headB;
        while(curr!=null){
            if(check.contains(curr)){
                return curr;
            }
            curr=curr.next;
        }
        return null;
    }
}