class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums){
            m.put(n, m.getOrDefault(n,0)+1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(k, (a,b) -> (b[1]-a[1]));

        for(Map.Entry<Integer, Integer> e : m.entrySet()){
            minHeap.offer(new int[]{e.getKey(), e.getValue()});
        }

        int[] res = new int[k];
        int i=0;
        while(k>0){
            res[i++] = minHeap.poll()[0];
            k--;
        }
        return res;
        
    }
}
