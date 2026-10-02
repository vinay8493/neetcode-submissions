class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findSubsets(output, ds, nums, 0, nums.length);
        return output;
        
    }

    public void findSubsets(List<List<Integer>> output, List<Integer> ds, int[] nums, int index, int len){
        if(index == len){
            output.add(new ArrayList(ds));
            return;
        }

        ds.add(nums[index]);
        findSubsets(output, ds, nums, index+1, len);
        ds.remove(ds.size()-1);
        findSubsets(output, ds, nums, index+1, len);
    }
}
