package tutorial;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.search(10));
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

         iterate using for each loop
        for(int item:stack){
            System.out.println(item);
        }

         using iterator
        var it=stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // loop and pop
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
