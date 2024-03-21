import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0 ;
        Set<Integer> set = new HashSet<>();
        int sol = 1;
        int count = 0;

        for(int n : nums){
            set.add(n);
        }
        for(int i =0 ; i<nums.length ; i++ ){
            int num = nums[i];
            if(!set.contains(nums[i]-1)){
                count  = 1;
                while(set.contains(num +1)){
                    count++;
                    num++;
                }
            }
            sol = Math.max(sol , count);
            if(sol > nums.length/2) break;
        }
        return sol ;
    }
}
