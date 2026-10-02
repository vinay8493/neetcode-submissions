class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Pair> st = new Stack();
        int[] ans = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            Pair pair = new Pair(temperatures[i], i);
            if(st.isEmpty()){
                st.push(pair);
            }
            else{
                while(!st.isEmpty() && st.peek().temperature < temperatures[i]){
                Pair temp = st.pop();
                ans[temp.index] = i - temp.index; 
                }

                st.push(pair);
            }
        }
        return ans;
        
    }

    class Pair{
        int temperature;
        int index;

        Pair(int temperature, int index){
            this.temperature = temperature;
            this.index = index;
        }
    }
}
