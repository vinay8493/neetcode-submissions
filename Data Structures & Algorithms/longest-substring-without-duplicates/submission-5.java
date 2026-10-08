class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        int l = 0;
        int r = 0;
        int length = 0;
        int longestLength = 0;
        int len = s.length();
        while(r < len){
            
            if(hash[s.charAt(r)] != -1 && hash[s.charAt(r)] >= l){
                    l = hash[s.charAt(r)]+1;
            }
            hash[s.charAt(r)] = r;
            
            length = r-l+1;
            longestLength = Math.max(length, longestLength);
            r++;
        }

        return longestLength;
        
    }
}
