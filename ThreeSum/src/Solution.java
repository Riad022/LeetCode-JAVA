import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List <List<Integer>> sol = new ArrayList<>();

        for(int i = 0 ; i< nums.length -2 ;i++){
            int target = 0 - nums[i] ;
            int start = i +1 ;
            int end = nums.length -1 ;

            if(i==0 || nums[i] != nums[i-1]){
                while(start < end){
                    if((nums[start] + nums[end]) == target){
                        List <Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        sol.add(list);
                        while (start < end && nums[start] == nums[start + 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        start++;
                        end--;
                    }else if( (nums[start] + nums[end]) < target) {
                        start ++ ;
                    }else{
                        end -- ;
                    }
                }
            }
        }
        return sol ;
    }
}