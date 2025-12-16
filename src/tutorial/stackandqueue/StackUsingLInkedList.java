package tutorial.stackandqueue;

public class StackUsingLInkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // top of stakc
    private Node top;
    StackUsingLInkedList(){
        top=null;
    }

    // push operation
    public void push(int value){
        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;
        System.out.println(value+" "+"pushed to stack");
    }
    // pop operation
        public int pop(){
        if(top==null){
            System.out.println("Stack Overflow");
            return -1;
        }
        int poppedValue=top.data;
        top=top.next;
        return poppedValue;
        }

        // peak operation
    public int peek(){
        if(top==null){
            System.out.println("stack is empty");
        }
        return top.data;
    }

    // check if stack is empty
        public boolean isEmpty(){
        return (top==null);
        }

    // Display stack element
    public void display(){
        if(top==null){
            System.out.println("Stack is empty!");
            return;
        }
        Node current=top;
        System.out.println("Stack");
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackUsingLInkedList stack=new StackUsingLInkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top Element:"+stack.peek());
        System.out.println("popped element:"+stack.pop());
        stack.display();
    }
}
