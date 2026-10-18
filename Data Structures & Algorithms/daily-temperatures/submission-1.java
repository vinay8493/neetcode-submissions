class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        Stack<int[]> st = new Stack<>();
        int[] res = new int[len];
        for(int i=0; i<len; i++){

            int t = temperatures[i];
            while(!st.isEmpty() && t > st.peek()[0]){
                res[st.peek()[1]] = i - st.peek()[1];
                st.pop();
            }

            st.push(new int[]{t,i});

        }

        return res;
    }
}
