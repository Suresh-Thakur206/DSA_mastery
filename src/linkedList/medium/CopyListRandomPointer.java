///*
//// Definition for a Node.
//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
//*/
//
//class Solution {
//    public Node copyRandomList(Node head) {
//        Map<Node, Node> map=new HashMap<>();
//        map.put(null,null);
//
//        // creating copy
//        Node curr=head;
//        while(curr!=null){
//            Node copy=new Node(curr.val);
//            map.put(curr,copy);
//            curr=curr.next;
//        }
//        // connecting node
//        curr=head;
//        while(curr!=null){
//            Node copy1=map.get(curr);
//            copy1.next=map.get(curr.next);
//            copy1.random=map.get(curr.random);
//            curr=curr.next;
//        }
//        return map.get(head);
//    }
//}