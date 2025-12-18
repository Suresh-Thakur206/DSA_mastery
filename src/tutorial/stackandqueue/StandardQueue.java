package tutorial.stackandqueue;
import java.util.Queue;
import java.util.LinkedList;

public class StandardQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        // Enqueueing Element
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("peek elemetn: "+q.peek());
        System.out.println("Remove : "+q.remove());
        System.out.println("peek element:"+q.peek());
        System.out.println("Size of Queue:"+q.size());
        System.out.println("is Queue Empty:"+q.isEmpty());
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        System.out.println("is Queue Empty:"+q.isEmpty());

    }
}
