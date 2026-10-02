class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int longestSeq=0;
        int length = 0;
        for(int n : set){
            length = 1;
            if(!set.contains(n-1)){
                while(set.contains(n+length)){
                    length++;
                }

                longestSeq = Math.max(longestSeq, length);
            }
        }

        return longestSeq;
    }
}
