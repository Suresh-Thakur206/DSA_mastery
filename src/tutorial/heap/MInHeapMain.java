package tutorial.heap;


public class MInHeapMain {
    public static void main(String args[]){
        MinHeap heap=new MinHeap(10);
        heap.insert(4);
        heap.insert(9);
        heap.insert(2);
        heap.insert(6);
        heap.insert(3);
        heap.insert(8);
        heap.insert(7);
        heap.insert(36);
        heap.insert(12);
        heap.insert(1);


        heap.printHeap();
        System.out.println("remove element:"+heap.removeMin());
        heap.printHeap();

    }
}
