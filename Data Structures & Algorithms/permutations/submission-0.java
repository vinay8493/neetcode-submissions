class Solution {
    public List<List<Integer>> permute(int[] nums) {

      List<List<Integer>> output = new LinkedList();
      List<Integer> ds = new LinkedList();
      boolean[] freq = new boolean[nums.length];
      getPermutations(nums, freq, ds, output); 
      return output;
    }

    public void getPermutations(int[] nums, boolean[] freq, List<Integer> ds, List<List<Integer>> output){
      if(ds.size() == nums.length){
        output.add(new LinkedList(ds));
        return;
      }
      for(int i = 0; i < nums.length; i++){
        if(!freq[i]){
        freq[i] = true;
        ds.add(nums[i]);
        getPermutations(nums, freq, ds, output);
        ds.remove(ds.size()-1);
        freq[i] = false;
      }
      }
      
    }
}
