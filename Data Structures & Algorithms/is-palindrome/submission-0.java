class Solution {
    public boolean isPalindrome(String s) {
        if(s == null)
        return false;

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int len = s.length();
        while(i < len){
            if(s.charAt(i) != s.charAt(len-1-i))
            return false;

            i++;
        }

        return true;
        
    }
}
