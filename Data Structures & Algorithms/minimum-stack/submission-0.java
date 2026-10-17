class MinStack {
    Stack<Pair> st;

    static class Pair{
        int val;
        int min;

        Pair(int val, int min){
            this.val = val;
            this.min = min;
        }
    }

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        Pair p;
        if(st.isEmpty()){
            p = new Pair(val, val);
        }else{
            p = new Pair(val, Math.min(val, st.peek().min));
        }

        st.push(p);
        
    }
    
    public void pop() {
        st.pop();
        
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}
