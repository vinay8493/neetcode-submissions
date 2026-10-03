class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums){
            m.put(n, m.getOrDefault(n,0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : m.entrySet()){
            arr.add(new int[]{e.getKey(), e.getValue()});
        }

        arr.sort((a,b)->(b[1]-a[1]));
        int[] result = new int[k];
        int i=0;
        while(k>0){
            result[i] = arr.get(i)[0];
            k--;
            i++;
        }

        return result;
        
    }
}
