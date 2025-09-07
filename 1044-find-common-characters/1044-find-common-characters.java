class Solution {
    public List<String> commonChars(String[] str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<str[0].length();i++){
            map.put(str[0].charAt(i),map.getOrDefault(str[0].charAt(i),0)+1);
        }
        System.out.println(map);
        for(int i = 1;i<str.length;i++){
            String s = str[i];
            Map<Character, Integer> map1 = new HashMap<>();
            for(int j = 0;j<s.length();j++){
                   map1.put(s.charAt(j),map1.getOrDefault(s.charAt(j),0)+1);
            }
            Map<Character, Integer> map2 = new HashMap<>();
            for(Map.Entry<Character, Integer> entry : map1.entrySet()){
                if(map.containsKey(entry.getKey())){
                    int min = Math.min(map.get(entry.getKey()),entry.getValue());
                    map2.put(entry.getKey(),min);
                }
            }
            map.clear();
            for(Map.Entry<Character, Integer> entry : map2.entrySet()){
                map.put(entry.getKey(),entry.getValue());
            }
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            for(int i =0;i<entry.getValue();i++){
                list.add(entry.getKey()+"");
            }
        }
        return list;
    }
}