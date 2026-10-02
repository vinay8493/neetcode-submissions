class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> output = new LinkedList();
        List<Integer> ds = new LinkedList();
        getCombinations(nums, target, ds, output, 0);
        return output;
    }

    public void getCombinations(int[] nums, int target, List<Integer> ds, List<List<Integer>> output, int index){
      if(index == nums.length){
        if(target == 0)
        output.add(new LinkedList(ds));
        return;
      }

    if(target - nums[index] >= 0){
      ds.add(nums[index]);
      getCombinations(nums, target-nums[index], ds, output, index);
      ds.remove(ds.size()-1);
    }
    getCombinations(nums, target, ds, output, index+1);
    }
}
