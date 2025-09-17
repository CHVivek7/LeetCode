class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, List<String>> map = new TreeMap<>();
        map.put("electronics", new ArrayList<>());
        map.put("grocery", new ArrayList<>());
        map.put("pharmacy", new ArrayList<>());
        map.put("restaurant", new ArrayList<>());
        for(int i = 0;i<isActive.length;i++){
            if(isActive[i]){
                String str = code[i].replaceAll("[a-zA-Z0-9_]","");
                if(str.length()>0){
                    continue;
                }
                if (!code[i].isEmpty() && map.containsKey(businessLine[i])) { 
                    List<String> list = map.get(businessLine[i]);
                    if (list != null) {
                        list.add(code[i]);
                    }
                    map.put(businessLine[i], list);
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            List<String> res = e.getValue();
            Collections.sort(res);
            for(String s : res){
                ans.add(s);
            }
        }
        return ans;
    }
}