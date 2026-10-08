class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int length = 0;
        int longestLength = 0;
        int len = s.length();
        while(r < len){
            
            if(map.get(s.charAt(r)) != null && map.get(s.charAt(r)) >= l){
                    l = map.get(s.charAt(r))+1;
            }
            map.put(s.charAt(r), r);
            
            length = r-l+1;
            longestLength = Math.max(length, longestLength);
            r++;
        }

        return longestLength;
        
    }
}
