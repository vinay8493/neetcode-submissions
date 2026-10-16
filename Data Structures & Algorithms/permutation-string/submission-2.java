class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length())
        return false;
        int[] hashS1 = new int[26];
        int[] hashS2 = new int[26];
        for(char c : s1.toCharArray()){
            hashS1[c-'a']++;
        }
        for(int i=0; i<s1.length(); i++){
            hashS2[s2.charAt(i)-'a']++;
        }
        int l=0;
        int r=s1.length();
        if(Arrays.compare(hashS1, hashS2) == 0)
        return true;

        while(r < s2.length()){
            hashS2[s2.charAt(r)-'a']++;
            r++;
            hashS2[s2.charAt(l)-'a']--;
            l++;
            if(Arrays.compare(hashS1, hashS2) == 0)
            return true;
        }

        return false;
        
    }
}
