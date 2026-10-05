class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int lastSmaller = Integer.MIN_VALUE;
        int longestSeq = 0;

        for(int n : nums){
            if(n-1 == lastSmaller){
                count++;
                lastSmaller = n;
            }else if(n != lastSmaller){
                count = 1;
                lastSmaller = n;
            }

            longestSeq = Math.max(longestSeq, count);
        }

        return longestSeq;
           
    }
}
