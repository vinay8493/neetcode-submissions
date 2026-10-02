class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new LinkedList();
        List<Integer> ds = new LinkedList();
        getSubsets(nums, 0, ds, output);
        return output;
    }

    public void getSubsets(int[] nums, int index, List<Integer> ds, List<List<Integer>> output){
      if(index == nums.length){
        output.add(new LinkedList(ds));
        return;
      }

      ds.add(nums[index]);
      getSubsets(nums, index+1, ds, output);
      ds.remove(ds.size()-1);
      getSubsets(nums, index+1, ds, output);
    }
}
