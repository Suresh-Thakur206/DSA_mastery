package tutorial.heap;

public class MaxHeap {
    int heap[];
    int capacity;
    int size;
    MaxHeap(int capacity){
        this.capacity=capacity;
        this.heap=new int[capacity];
        size=0;
    }
//    parent and children index;
    public int parent(int i){
        return (i-1)/2;
    }
    public int leftChild(int i){
        return (i*2+1);
    }
    public int rightChild(int i){
        return (i*2+2);
    }
//    insert funtion
    public void insert(int value){
        if(size==capacity){
            System.out.println("heap is full!");
            return;
        }
        heap[size]=value;
        int current=size;
        size++;
//        Heapify up
        while (current > 0 && heap[current] > heap[parent(current)]) {
            swap(current,parent(current));
            current=parent(current);
        }

    }

    //    remove root element
    public int removeMax(){
        if(size==0){
            System.out.println("heap is empty!");
            return -1;
        }
        int max=heap[0];
        heap[0]=heap[size-1];
        size--;
        heapify(0);
        return max;
    }
    //    Heapify Down
    public void heapify(int i){
        int largest=i;
        int left=leftChild(i);
        int right=rightChild(i);
        if(left<size && heap[left]>heap[largest]){
            largest=left;
        }
        if(right<size && heap[right]>heap[largest]){
            largest=right;
        }
        if(largest!=i){
            swap(i,largest);
            heapify(largest);
        }
    }
//    Swap function
    public void swap(int i,int j){
        int temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }

    //    print heap
    public void printHeap(){
        for(int i=0;i<size;i++){
            System.out.print(heap[i] + " ");
            System.out.println();
        }
    }
}
