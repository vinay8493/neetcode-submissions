class Solution {
    public boolean checkValidString(String s) {
        return checkString(s, 0, 0);
        
    }

    private boolean checkString(String s, int index, int count){
        if(index == s.length()){
            return count==0;
        }

        if(count < 0)
        return false;

        if(s.charAt(index) == '('){
            return checkString(s, index+1, count+1);
        }

        if(s.charAt(index) == ')'){
            return checkString(s, index+1, count-1);
        }

        return checkString(s, index+1, count+1) || checkString(s, index+1, count) || checkString(s, index+1, count-1);
    }
}
