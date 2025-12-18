import java.util.Queue;
import java.util.LinkedList;


class MyStack {
    Queue<Integer> q1;

    public MyStack() {
        q1=new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
        int n=q1.size()-1;
        for(int i=0;i<n;i++){
            q1.add(q1.remove());
        }
    }

    public int pop() {

        int k=q1.remove();
        return k;
    }

    public int top() {

        return q1.peek();
    }


    public boolean empty() {
        return q1.isEmpty();
    }
}

/*
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */