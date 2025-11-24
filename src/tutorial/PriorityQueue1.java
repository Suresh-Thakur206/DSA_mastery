package tutorial;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
//        PriorityQueue<Integer> fill=new PriorityQueue<>();
//        fill.add(4);
//
//        fill.add(2);
//        fill.add(1);
//        System.out.println(fill.peek());
//        System.out.println(" ");
//        while(!fill.isEmpty()){
//            System.out.println(fill.poll());
//    }
        PriorityQueue<Integer> fill=new PriorityQueue<>((a,b) -> b-a);
        fill.add(4);

        fill.add(2);
        fill.add(1);
        System.out.println(fill.peek());
        System.out.println(" ");
        while(!fill.isEmpty()){
            System.out.println(fill.poll());
        }
        }
    }

