class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int longestRectangle = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<len; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                int ind = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                longestRectangle = Math.max(longestRectangle, heights[ind] * (nse-pse-1));
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int ind = st.pop();
            int nse = len;
            int pse = st.isEmpty() ? -1 : st.peek();
            longestRectangle = Math.max(longestRectangle, heights[ind] * (nse - pse -1));
        }

        return longestRectangle;
        
    }
}
