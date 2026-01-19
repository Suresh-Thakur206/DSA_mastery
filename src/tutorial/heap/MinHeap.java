package tutorial.heap;

public class MinHeap {
    int heap[];
    int capacity;
    int size;
    //constructor
    MinHeap(int capacity){
        this.capacity=capacity;
        this.heap=new int[capacity];
        size=0;
    }
//    getting parent and children indexes
    public int parent(int i){
        return (i-1)/2;
    }
    public int leftChild(int i){
        return (i*2+1);
    }
    public int rightChild(int i){
        return (i*2+2);
    }
    // insert funciton
    public void insert(int value){
        if(size==capacity){
            System.out.println("Heap is full ! ");
            return ;
        }
        heap[size]=value;
        int current =size;
        size++;
//        Heapify up
        while(current>0 && heap[current]<heap[parent(current)]){
            swap(current,parent(current));
            current=parent(current);
        }
    }
//    remove root element
    public int removeMin(){
        if(size==0){
            System.out.println("heap is empty!");
            return -1;
        }
        int min=heap[0];
        heap[0]=heap[size-1];
        size--;
        heapify(0);
        return min;
    }
//    Heapify Down
    public void heapify(int i){
        int smallest=i;
        int left=leftChild(i);
        int right=rightChild(i);
        if(left<size && heap[left]<heap[smallest]){
            smallest=left;
        }
        if(right<size && heap[right]<heap[smallest]){
            smallest=right;
        }
        if(smallest!=i){
            swap(i,smallest);
            heapify(smallest);
        }
    }


//    swap function
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
