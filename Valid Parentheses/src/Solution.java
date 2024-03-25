import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if( (c == '}' || c == ')' || c == ']') && stack.isEmpty()) return false;

            if( (c == '}' && stack.peek() == '{' )
                    || (c == ')' && stack.peek() == '(')
                    || (c == ']' && stack.peek() == '[')
            ){
                stack.pop();
            }else{
                stack.add(c);
            }
        }
        return stack.isEmpty();
    }
}