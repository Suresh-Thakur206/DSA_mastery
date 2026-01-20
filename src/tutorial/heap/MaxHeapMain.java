package tutorial.heap;

public class MaxHeapMain {
    public static void main(String[] args) {
        MaxHeap heap1=new MaxHeap(10);
        heap1.insert(4);
        heap1.insert(9);
        heap1.insert(2);
        heap1.insert(6);
        heap1.insert(3);
        heap1.insert(8);
        heap1.insert(7);
        heap1.insert(36);
        heap1.insert(12);
        heap1.insert(40);



        heap1.printHeap();
        System.out.println("");
        System.out.println(heap1.removeMax());
        System.out.println("");
        heap1.printHeap();
    }
}
