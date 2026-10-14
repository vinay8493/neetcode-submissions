class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        return 0;
        Arrays.sort(nums);
        int count = 1;
        int longestSeq = 1;
        for(int i=1; i<nums.length; i++){
            count=1;
            while(i < nums.length && nums[i]-nums[i-1] <= 1)
            {
                
                if(nums[i]-nums[i-1] != 0)
                count++;

                i++;
            }

            longestSeq = Math.max(count, longestSeq);
        } 

        return longestSeq;      
    }
}
