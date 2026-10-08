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

            while(r-l+1 - maxFreq > k){
                hash[s.charAt(l)-'A']--;
                maxFreq = 0;
                for(int i=0; i<26; i++){
                    maxFreq = Math.max(maxFreq, hash[i]);
                }
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
