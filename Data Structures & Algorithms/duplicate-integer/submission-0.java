class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hSet = new HashSet<>();
        for(int num : nums){
            if(!hSet.add(num))
            return true;
        }
        return false;
    }
}
