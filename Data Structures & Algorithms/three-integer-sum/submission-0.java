class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int prev = 0;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1])
            continue;

            int l = i+1;
            int r = nums.length-1;
            
            while(l < r){
                ds = new ArrayList<>();
                if(nums[i]+nums[l]+nums[r] == 0)
                {
                    ds.add(nums[i]);
                    ds.add(nums[l]);
                    ds.add(nums[r]);
                    res.add(ds);
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                }else if(nums[i]+nums[l]+nums[r] > 0){
                    r--;
                }else{
                    l++;
                }  
            }
        }
        return res;
    }
}
