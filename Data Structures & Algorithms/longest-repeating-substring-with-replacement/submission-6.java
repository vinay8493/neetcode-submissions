class Solution {
    public int characterReplacement(String s, int k) {
        int len=s.length();
        int l=0;
        int r=0;
        int[] hash = new int[26];
        int maxFreq = 0;
        int length =0;
        int maxLength = 0;
        while(r < len){
            hash[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(r)-'A']);

            while(r-l+1-maxFreq > k){
                hash[s.charAt(l)-'A']--;
                l++;
                maxFreq = 0;
                for(int i=0; i<26; i++){
                    maxFreq = Math.max(hash[i], maxFreq);
                }
            }

            if(r-l+1-maxFreq <= k){
                maxLength = Math.max(r-l+1, maxLength);
            }
            r++;
        }

        return maxLength;
        
    }
}
