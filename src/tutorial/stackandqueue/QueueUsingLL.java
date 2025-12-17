package tutorial.stackandqueue;

import java.util.Queue;

public class QueueUsingLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }

    }
    private Node front,rear;
    QueueUsingLL(){
        front=rear=null;
    }
    // Enqueue Operation
    public void enqueue(int value){
        Node newNode=new Node(value);
        if(rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    // Dequeue Operation
    public void dequeue(){
        if(front==null){
            System.out.println("Queue is Empty!");
            return;
        }
        front=front.next;
        if(front==null){
            rear=null;
        }
    }

    // Peak Operation
    public int peak(){
        if(front==null){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return front.data;
    }

    // Displaying Queue Element
    public void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLL q=new QueueUsingLL();
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(9);
        q.enqueue(8);
        q.display();
        q.dequeue();
        q.display();
        System.out.println(q.peak());
    }
}
