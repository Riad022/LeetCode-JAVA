class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] sol = new int[nums.length];

        int i = 0 , j = nums.length -1 ;
        while(i < nums.length){
            if(i==0 || j == nums.length){
                left[i] = nums[i];
                right[j] = nums[j];
            }else{
                left[i] = nums[i] * left[i-1];
                right[j] = nums[j] * right[j+1];
            }
            i++;
            j--;
        }
        for( i = 0 ; i<nums.length ;i++){
            if(i==0){
                sol[i] = right[i + 1];
            }else if(i== nums.length-1){
                sol[i] = left[i-1];
            }else{
                sol[i] = left[i-1] * right[i+1];
            }
        }
        return sol ;
    }
}