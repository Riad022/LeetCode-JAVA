import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];

        for(int curr = 0 ; curr < temperatures.length ; curr++){
            while(!stack.isEmpty() && temperatures[curr] > temperatures[stack.peek()]){
                int prev = stack.pop();
                ans[prev] = curr - prev ;
            }
            stack.add(curr);
        }
        return ans ;
    }
}