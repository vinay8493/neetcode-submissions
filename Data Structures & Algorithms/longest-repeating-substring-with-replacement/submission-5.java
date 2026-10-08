class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxFreq = 0;
        int len = s.length();
        int[] hash = new int[26];
        int maxLength = 0;
        while(r < len){
            hash[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(r)-'A']);

            if(r-l+1 - maxFreq > k){
                hash[s.charAt(l)-'A']--;
                l++;    
            }

            if(r-l+1 - maxFreq <= k){
                maxLength = Math.max(maxLength, r-l+1);
            }
            r++;
        }

        return maxLength;
        
    }
}
