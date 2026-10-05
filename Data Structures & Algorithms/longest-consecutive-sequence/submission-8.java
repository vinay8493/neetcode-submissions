class Solution {
    public int longestConsecutive(int[] nums) {
        int longestSq = 0;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        for(int i : set){
            if(!set.contains(i-1)){
                count=1;
                int x = i;

                while(set.contains(x+1)){
                    count++;
                    x = x+1;
                }

            }
            longestSq = Math.max(count, longestSq);
        }

        return longestSq;
           
    }
}
