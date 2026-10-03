class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] hashArray = new int[26];
            for(char c : s.toCharArray()){
                hashArray[c - 'a']++;
            }
            String key = Arrays.toString(hashArray);
            List<String> newList = new ArrayList<>();
            newList.add(s);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                map.put(key, newList);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> e : map.entrySet()){
            result.add(e.getValue());
        }
        return result;
        
    }
}
