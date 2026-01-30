package tutorial.heap;


import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(4);
        pq.add(5);
        pq.add(1);
        pq.add(9);
        pq.add(7);
        System.out.println(pq.peek());
        int remove=pq.poll();
        System.out.println(remove);
        System.out.println(pq.size());

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()+" ");
        }
        System.out.println(pq.size());
    }
}
