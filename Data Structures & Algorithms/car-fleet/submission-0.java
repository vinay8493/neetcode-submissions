class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] p = new int[position.length][2];
        for(int i=0; i<p.length; i++){
            p[i][0] = position[i];
            p[i][1] = speed[i];
        }

        Arrays.sort(p, (a,b) -> b[0]-a[0]);

        Stack<Double> st = new Stack<>();
        for(int i=0; i<p.length; i++){
            st.push((double)(target-p[i][0])/p[i][1]);

            if(st.size() >= 2 && st.peek() <= st.get(st.size()-2)){
                st.pop();
            }
        }
        return st.size();
        
    }
}
