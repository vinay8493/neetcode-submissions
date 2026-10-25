class TimeMap {
    Map<String, TreeMap<Integer, String>> data;

    public TimeMap() {
        data = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(data.containsKey(key)){
            data.get(key).put(timestamp, value);
        }else{
            TreeMap<Integer, String> map = new TreeMap<>((a,b) -> (a-b));
            map.put(timestamp, value);
            data.put(key, map);
        }
    }
    
    public String get(String key, int timestamp) {
        if(data.containsKey(key)){
            TreeMap<Integer, String> m = data.get(key);
            if(m.get(timestamp) != null)
            return m.get(timestamp);
            else{
                Map.Entry<Integer, String> entry = m.floorEntry(timestamp);

                return entry == null ? "" : entry.getValue();
            }
        }else{
            return "";
        }
    }
}
