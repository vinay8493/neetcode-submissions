class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1){
      return Integer.parseInt(tokens[0]);
    }
    int output = 0;
    Stack<Integer> st = new Stack<>();
    for(String s : tokens){
      if(st.isEmpty())
        st.push(Integer.parseInt(s));
      else {
        if(!st.isEmpty()){
          switch (s){
            case "+":
              if (st.size() > 1) {
                output = st.pop() + st.pop();
                st.push(output);
              }
              break;
            case "-" :
              if(st.size() > 1){
                int b = st.pop();
                int a = st.pop();
                output = a-b;
                st.push(output);
              }
              break;
            case "*" :
              if(st.size() > 1){
                output = st.pop() * st.pop();
                st.push(output);
              }
              break;
            case "/" :
              if(st.size() > 1){
                int divisor = st.pop();
                int dividend = st.pop();
                if(divisor == 0){
                  st.push(0);
                }else {
                  output = dividend / divisor;
                  st.push(output);
                }
              }
              break;
            default:
              st.push(Integer.parseInt(s));
          }
        }
      }

    }
    return st.pop();
    }
}
