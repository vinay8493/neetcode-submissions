class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> output = new LinkedList();
        List<String> ds = new LinkedList();
        getPalindrome(ds, output, 0, s);
        return output;
    }

    private void getPalindrome(List<String> ds, List<List<String>> output, int index, String s){
        if(index == s.length()){
            output.add(new LinkedList(ds));
            return;
        }

        for(int i = index; i<s.length(); i++){
            if(isPalindrome(s.substring(index, i+1))){
                ds.add(s.substring(index, i+1));
                getPalindrome(ds, output, i+1, s);
                ds.remove(ds.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
