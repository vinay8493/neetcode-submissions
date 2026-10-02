class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax = 0;
        int rightMax = 0;
        int[] prefixMax = new int[n];
        int[] sufficeMax = new int[n];

        prefixMax[0] = height[0];
        sufficeMax[n-1] = height[n-1];
        for(int i = 1; i<n-1; i++){
            prefixMax[i] = Math.max(height[i], prefixMax[i-1]);
        }

        for(int i = n-2; i >= 0 ; i--){
            sufficeMax[i] = Math.max(height[i], sufficeMax[i+1]);
        }
        int totalUnit = 0;
        for(int i=0; i<n; i++){
            leftMax = prefixMax[i];
            rightMax = sufficeMax[i];
            if(height[i] < leftMax && height[i] < rightMax)
            totalUnit += Math.min(leftMax, rightMax) - height[i];  
        }

        return totalUnit;
    }
}
