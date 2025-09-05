class Solution {
    public String mostCommonWord(String s, String[] banned) {
        List<String> list= new ArrayList<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        s = s.toLowerCase();
        String[] str = s.split(",");
        for(String a : str){
            
            String[] abc = a.split(" ");
            for(String x : abc){
                if(x== ""){
                    continue;
                }
                x = x.replaceAll("[^a-zA-Z]","");
                if(!list.contains(x) ){
                    map.put(x,map.getOrDefault(x,0)+1);   
                }
            }
        }
        int max = 0;
        String ans = "";
        System.out.println(map);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}