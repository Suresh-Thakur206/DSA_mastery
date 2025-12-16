package tutorial.stackandqueue;

public class QueueUsingArray {
    private int[]arr;
    private int rear;
    private int front;
    private int capacity;

    // constructor
    public QueueUsingArray(int size) {
        capacity=size;
        arr=new int[capacity];
        rear=-1;
        front=0;
    }
    // checking is Queue empty?
    public boolean isEmpty(){
        return front>rear;
    }

    // checking is Queue full ?
    public boolean isFull(){
        return(rear==capacity-1);
    }
    // Enqueue Operation
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue OverFlow! cannot insert: " + value);
            return;
        }
        arr[++rear]=value;
        System.out.println(value + ": Enqueued to Queue");
    }

    // Dequeue Operation
    public int dequeue(){
        if(isEmpty()){
            System.out.println("UnerFlow queue! cannot retrive");
            return -1;
        }
        int value=arr[front];
        front++;
        return value;
    }
    // peak / Front Operation
    public int peak(){
        if(isEmpty()){
            System.out.println("Queue is Empty! cannot retrive");
            return -1;
        }
        return arr[front];
    }
    //Displaying Queue Element
     public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty! ");
            return;
        }
         System.out.println("Queue:");
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
     }
    public static void main(String[] args) {
        QueueUsingArray queue=new QueueUsingArray(5);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(8);
        queue.enqueue(5);
        queue.enqueue(9);
        queue.display();
        System.out.println("Dequeued: "+queue.dequeue());
        System.out.println("Front Element "+queue.peak());
        queue.display();
    }
}
