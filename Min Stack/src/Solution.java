import java.util.Stack;

class MinStack {
    Stack<Integer> stack ;
    Stack <Integer> real ;

    public MinStack() {
        stack = new Stack<>();
        real = new Stack<>();
    }

    public void push(int val) {
        real.add(val);
        if(stack.isEmpty()){
            stack.add(val);
        }else{
            if(val < stack.peek()){
                stack.add(val);
            }else{
                stack.add(stack.peek());
            }
        }
    }

    public void pop() {
        stack.pop();
        real.pop();
    }

    public int top() {
        return real.peek();
    }

    public int getMin() {
        return stack.peek();
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