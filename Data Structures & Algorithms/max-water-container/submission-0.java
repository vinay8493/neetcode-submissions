class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int width = 0;
        int currentWater = 0;
        int maxWater = 0;
        int height = 0;
        while(l<r){
            width = r-l;
            height = Math.min(heights[l], heights[r]);
            currentWater = height*width;

            if(heights[l] < heights[r])
            l++;
            else
            r--;

            maxWater = Math.max(currentWater, maxWater);
        }

        return maxWater;
        
    }
}
