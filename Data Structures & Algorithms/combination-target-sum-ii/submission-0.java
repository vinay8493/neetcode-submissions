class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> ds = new LinkedList();
        List<List<Integer>> output = new LinkedList();
        Arrays.sort(candidates);
        getCombinations(candidates, ds, output, target, 0);
        return output;
    }

    private void getCombinations(int[] candidates, List<Integer> ds, List<List<Integer>> output, int target, int index){
      if(index == candidates.length){
        if(target == 0 && !output.contains(ds))
        output.add(new LinkedList(ds));

        return;
      }

        if(target-candidates[index] >= 0){
        ds.add(candidates[index]);
        getCombinations(candidates, ds, output, target-candidates[index], index+1);
        ds.remove(ds.size()-1);
        }
        getCombinations(candidates, ds, output, target, index+1);

        
    }
}
