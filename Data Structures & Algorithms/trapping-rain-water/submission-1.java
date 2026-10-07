class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] prefixMax = new int[len];
        int[] suffixMax = new int[len];

        prefixMax[0] = height[0];
        for(int i=1; i<len; i++ ){
            prefixMax[i] = Math.max(prefixMax[i-1], height[i]);
        }

        suffixMax[len-1] = height[len-1];
        for(int i=len-2; i>=0; i--){
            suffixMax[i] = Math.max(height[i], suffixMax[i+1]);
        }

        int totalWater = 0;
        for(int i=0; i<len; i++){
            if(height[i] < prefixMax[i] && height[i] < suffixMax[i]){
                totalWater += Math.min(prefixMax[i], suffixMax[i]) - height[i];
            }
        }

        return totalWater; 
        
    }
}
