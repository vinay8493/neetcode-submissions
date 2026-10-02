class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Hash = new int[26];
        int[] s2Hash = new int[26];
        int right = 0;
        int left = 0;
        int s1Len = s1.length();
        int s2Len = s2.length();

        if(s1Len > s2Len)
        return false;

        while(right < s1Len){
            s1Hash[s1.charAt(right) - 'a']++;
            s2Hash[s2.charAt(right) - 'a']++;
            right++;
        }
        right--;
        while(right < s2Len){
            if(Arrays.equals(s1Hash, s2Hash))
            return true;

            right++;
            if(right != s2Len){
                s2Hash[s2.charAt(right) - 'a']++;
            }
            s2Hash[s2.charAt(left)-'a']--;
            left++;
            
        }
        return false;
    }
}
