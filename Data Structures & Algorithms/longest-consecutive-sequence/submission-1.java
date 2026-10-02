class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longestCons = 1;
        int longestConsSeq = 1;
        if(nums.length == 0)
        return 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]-nums[i-1] == 1 || nums[i]-nums[i-1] == -1){
                longestCons++;
                if(longestConsSeq < longestCons){
                    longestConsSeq = longestCons;
                }
            }
            else if(nums[i]-nums[i-1] == 0){

            }
            else{
                longestCons = 1;
            }
        }
        return longestConsSeq;
    }
}
