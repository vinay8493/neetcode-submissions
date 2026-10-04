class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefixProduct = new int[nums.length];
        int[] postfixProduct = new int[nums.length];
        int len = nums.length;

        for(int i=0; i<nums.length; i++){
            if(i==0){
               prefixProduct[i] = nums[i]; 
               postfixProduct[len-1-i] = nums[nums.length-1];
            }else{
                prefixProduct[i] =nums[i]*prefixProduct[i-1];
                postfixProduct[len-1-i] = nums[len-1-i] * postfixProduct[len-i];
            } 
        }
        int[] res = new int[len]; 
        for(int i = 0; i<len; i++){
            if(i==0){
                res[i] = postfixProduct[i+1];
                continue;
            }
            

            if(i == len-1){
                res[i] = prefixProduct[i-1];
                continue;
            }

            res[i] = prefixProduct[i-1]*postfixProduct[i+1];
        }

        return res;
        
    }
}  
