class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for(List<String> list : paths){
            map.put(list.get(0),list.get(1));
        }
        String str = paths.get(0).get(0);
        while(true){
            if(map.containsKey(str)){
                str = map.get(str);
            }
            else{
                break;
            }
        }
        return str;
    }
}