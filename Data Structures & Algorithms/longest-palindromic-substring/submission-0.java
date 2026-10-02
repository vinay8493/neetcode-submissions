class Solution {
    public String longestPalindrome(String s) {
        String longestString = "";
        if(s.length() == 1)
        return s;
        for(int i=0; i < s.length(); i++){
            for(int j=i+1; j <= s.length(); j++){
                if(isPallindrome(s.substring(i,j)) && s.substring(i,j).length() >= longestString.length()){
                    longestString = s.substring(i,j);
                }
            }
        }
        return longestString;
        
    }

    private boolean isPallindrome(String s){
        int start = 0;
        int end = s.length()-1;

        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--))
            return false;
        }
        return true;
    }
}
