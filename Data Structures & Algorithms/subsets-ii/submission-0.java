class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ds = new LinkedList();
        List<List<Integer>> output = new LinkedList();
        Arrays.sort(nums);
        getSubsets(nums, 0, ds, output);
        return output;
    }

    public void getSubsets(int[] nums, int index, List<Integer> ds, List<List<Integer>> output){
      if(index == nums.length){
        if(!output.contains(ds))
        output.add(new LinkedList(ds));

        return;
      }

      ds.add(nums[index]);
      getSubsets(nums, index+1, ds, output);
      ds.remove(ds.size()-1);
      getSubsets(nums, index+1, ds, output);
    }
}
