class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1;
        for(int pile : piles){
            right = Math.max(right , pile);
        }

        while(left < right){
            int mid = (right + left) / 2 ;
            int hrs = 0 ;

            for(int pile : piles){
                hrs += Math.ceil((double)pile / mid);
            }

            if(hrs <= h ){
                right = mid ;
            }else{
                left = mid +1 ;
            }
        }
        return right ;
    }
}