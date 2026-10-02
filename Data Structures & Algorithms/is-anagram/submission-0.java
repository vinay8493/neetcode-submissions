class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hMap1 = new TreeMap<>();
        for(char ch : s.toCharArray()){
            if(hMap1.get(ch) != null){
                int val = hMap1.get(ch);
                hMap1.put(ch, ++val);
            }else{
                hMap1.put(ch, 1);
            }
        }

        Map<Character, Integer> hMap2 = new TreeMap<>();
        for(char ch : t.toCharArray()){
            if(hMap2.get(ch) != null){
                int val = hMap2.get(ch);
                hMap2.put(ch, ++val);
            }else{
                hMap2.put(ch, 1);
            }
        }

        return hMap1.equals(hMap2);
    }
}
