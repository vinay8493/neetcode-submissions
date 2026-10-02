class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hMap.get(target - nums[i]) == null){
                hMap.put(nums[i], i);
            }else {
                return new int[]{hMap.get(target - nums[i]), i};
            }
        }
        return null;
    }
}
