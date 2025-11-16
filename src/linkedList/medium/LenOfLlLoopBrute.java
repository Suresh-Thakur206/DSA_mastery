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
//        HashMap<Node,Integer> map=new HashMap<>();
//        Node curr=head;
//        int timer=0;
//        while(curr!=null){
//            if(map.containsKey(curr)){
//                int len=timer-map.get(curr);
//                return len;
//            }
//            map.put(curr,timer);
//            curr=curr.next;
//            timer++;
//        }
//        return 0;
//    }
//}a