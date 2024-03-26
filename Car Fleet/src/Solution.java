import java.util.* ;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 1) return 1;
        int[][] cars = new int[position.length][2];
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, Comparator.comparingInt(o -> o[0]));

        for (int i = cars.length - 1; i >= 0; i--) {
            double time = ((double)(target - cars[i][0])) / cars[i][1];
            if (!stack.isEmpty() && time <= stack.peek()) {
                continue;
            } else {
                stack.add(time);
            }
        }
        return stack.size();
    }
}
