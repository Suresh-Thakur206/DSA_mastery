class MinStack {

    Stack<Integer>stack;
    Stack<Integer>minStack;

    public MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
    }

    public void pop() {

        int value=stack.pop();
        if(value==minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        int value=stack.peek();
        return value;
    }

    public int getMin() {
        int minVal=minStack.peek();
        return minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */