class Solution {
    public String minWindow(String s, String t) {
        int count = 0;
        int l=0;
        int r=0;
        int len = s.length();
        int m = t.length();
        int[] hash = new int[256];
        int startIndex = -1;
        int minLen=Integer.MAX_VALUE;
        for(char c : t.toCharArray()){
            hash[c]++;
        }

        while(r < len){
            if(hash[s.charAt(r)] > 0){
                count++;
            }
            

            while(count == m){
                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    startIndex = l;
                }

                hash[s.charAt(l)]++;

                if(hash[s.charAt(l)] > 0)
                count--;

                l++;
            }
            hash[s.charAt(r)]--;
            r++;
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex+minLen);
        
    }
}
