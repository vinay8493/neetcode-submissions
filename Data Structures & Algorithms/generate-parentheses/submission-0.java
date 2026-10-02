class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder s = new StringBuilder();
        List<String> output = new LinkedList();
        getValidParanthesis(0, 0, output, n, s);
        return output;
    }

    private void getValidParanthesis(int open, int closed, List<String> output, int n, StringBuilder st){

        if(open == closed && open == n){
            output.add(st.toString());
            return;
        }
        
        if(open < n){
            st.append('(');
            getValidParanthesis(open+1, closed, output, n, st);
            st.deleteCharAt(st.length()-1);
        }

        if(closed < open){
            st.append(')');
            getValidParanthesis(open, closed+1, output, n, st);
            st.deleteCharAt(st.length()-1);
        }

    }


}
