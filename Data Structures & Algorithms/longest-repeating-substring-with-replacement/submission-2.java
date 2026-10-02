class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash = new int[26];
        int maxFreq = 0;
        int l = 0;
        int r = 0;
        int length =0;
        int maxLength = 0;
        int n = s.length();
        while(r < n){
            hash[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(r)-'A']);
            length = r-l+1;
            if(length-maxFreq>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            if(length-maxFreq<=k){
                maxLength = Math.max(maxLength, length);
            }
            r++;
        }
        return maxLength;
        
    }
}
