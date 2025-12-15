package tutorial.stackandqueue;

import java.util.Scanner;

public class StackUsingArray {
    private int maxSize;
    private int []stackArray;
    private int top;

    public StackUsingArray(int size){
        maxSize=size;
       stackArray=new int[maxSize];
        top=-1;
    }

    // inserting element
    public void push(int value){
        if(top>=maxSize-1){
            System.out.println("Stack overflow! cannot push : "+value);
        }else{
            stackArray[++top]=value;
            System.out.println(value+":pushed into stack");
        }
    }

    // Poping the element form stack
    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow! cannot popped");
            return -1;
        }else{
            int value=stackArray[top--];
            System.out.println(value+"poped from stack");
            return value;
        }
    }
    // Displaying Value
    public void display(){
        if(top==-1){
            System.out.println("stack is empty!");
        }else{
            System.out.println("Elements are : ");
            for(int i=0;i<=top;i++){
                System.out.print(stackArray[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Stack");
        int size=sc.nextInt();
        StackUsingArray stack=new StackUsingArray(size);
        int choice;
        do{
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push (Add) element");
            System.out.println("2. Pop element");
            System.out.println("3. Display stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter value to push:");
                    int value=sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting Program");
                    break;
                default:
                    System.out.println("Invalid! choice , please try again");
            }
        }while(choice!=4);
        sc.close();
    }
}
