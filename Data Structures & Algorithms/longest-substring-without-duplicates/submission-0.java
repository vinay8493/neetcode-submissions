class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        int l = 0;
        int r = 0;
        int length = 0;
        int maxLength = 0;
        int n = s.length();
        Arrays.fill(hash, -1);
        while(r<n){
            if(hash[s.charAt(r)] != -1){
                if(hash[s.charAt(r)] >= l){
                    l = hash[s.charAt(r)]+1;
                }
            }

            length = r-l+1;
            if(length > maxLength){
                maxLength = length;
            }
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLength;
        
    }
}
