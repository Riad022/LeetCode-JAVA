import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String s : tokens ){
            if(s.equals("+")){
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.add(n1 + n2);
            }else if(s.equals("-")){
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.add(n2 - n1);
            } else if(s.equals("*")){
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.add(n1 * n2);
            } else if(s.equals("/")){
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.add(n2 / n1);
            }else{
                stack.add(Integer.parseInt(s));
            }
        }
        return stack.peek() ;
    }
}