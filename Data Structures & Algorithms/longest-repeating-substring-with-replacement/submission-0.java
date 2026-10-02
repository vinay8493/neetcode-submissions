class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int length = s.length();
        int maxLength = 0;
        int maxFreq = 0;
        int hash[] = new int[26];
        char[] charArray = s.toCharArray();
        while(r < length){
            hash[charArray[r] - 'A']++;
            maxFreq = Math.max(maxFreq, hash[charArray[r] - 'A']);

            while((r-l+1 - maxFreq) > k){
                hash[charArray[l]-'A']--;
                maxFreq = 0;
                for(int i=0; i<26; i++){
                    maxFreq = Math.max(maxFreq,hash[i]);
                }
                l++;
            }

            if(r-l+1-maxFreq <= k){
                maxLength = Math.max(maxLength, r-l+1);
            }
            r++;
        }

        return maxLength;
        
    }
}
