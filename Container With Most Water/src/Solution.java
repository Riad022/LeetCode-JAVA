class Solution {
    public int maxArea(int[] height) {
        int left = 0 ;
        int right = height.length -1 ;
        int sol = 0;

        while(left < right){
            int area = right - left ;
            int curr = Math.min(height[left] , height[right]) * area;
            sol = Math.max(sol , curr);

            if(height[left] < height[right]) left++ ;
            else right-- ;
        }
        return sol ;
    }
}