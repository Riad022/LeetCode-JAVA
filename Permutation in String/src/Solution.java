import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] freq2 = new int[26] ;
        int n = s1.length() ;

        for(int i = 0 ; i < n ;i++){
            freq[s1.charAt(i) - 'a'] ++;
        }

        for(int i = 0 ; i< s2.length() ;i++){
            freq2[s2.charAt(i) - 'a']++;

            if(i >= n){
                freq2[s2.charAt(i - n) - 'a'] --;
            }

            if(Arrays.equals(freq , freq2)){
                return true ;
            }
        }
        return false ;
    }
}