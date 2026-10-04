class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums){
            m.put(n, m.getOrDefault(n,0)+1);
        }

        List<Integer>[] arr = new ArrayList[nums.length+1];
        for(int i=0; i<arr.length; i++){
            arr[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> e : m.entrySet()){
            arr[e.getValue()].add(e.getKey());
        }
        int[] res = new int[k];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            for(int n : arr[i]){
                res[j++] = n;
                if(j == k)
                return res;
            }
        }

        return res;
    }
}
