import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer , Integer>> pq = new PriorityQueue<>(
                (a , b) -> a.getValue() - b.getValue()
        );

        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        for(Map.Entry<Integer , Integer> m : map.entrySet()){
            pq.add(m);
            if(pq.size() > k ) pq.poll();
        }
        int[] arr = new int[k];

        int i = k ;
        while(!pq.isEmpty()){
            arr[--i] = pq.poll().getKey();
        }
        return arr ;
    }
}