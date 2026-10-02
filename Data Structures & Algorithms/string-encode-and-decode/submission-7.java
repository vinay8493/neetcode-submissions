class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0)
        return null;

        StringBuilder sBuilder = new StringBuilder();
        for(String s : strs){
            sBuilder.append(s.length()).append("#").append(s);
        }
        return sBuilder.toString();
    }

    public List<String> decode(String str) {
        if(str == null)
        return new LinkedList<>();

        if(str.equals(""))
        return List.of("");

        List<String> strList = new LinkedList<>();
        int len = str.length();
        int i=0;
        while(i < len){
            int hashIndex = str.indexOf("#",i);
            int lengthOfStr = Integer.parseInt(str.substring(i,hashIndex));

            int startIdx = hashIndex+1;
            int endIdx = startIdx + lengthOfStr;
            strList.add(str.substring(startIdx, endIdx));
            i = endIdx;
        }
        return strList;
    }
}

