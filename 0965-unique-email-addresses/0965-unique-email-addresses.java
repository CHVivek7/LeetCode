class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String, HashSet<String>> map = new HashMap<>();
        for(int i = 0;i<emails.length;i++){
            String str = emails[i];
            String s = str.substring(str.indexOf("@")+1);
            if(map.containsKey(s)){
                HashSet<String> set = map.get(s);
                int index = str.indexOf("+");
                if(index < 0){
                    String a = str.substring(0,str.indexOf("@"));
                    a = a.replaceAll("[^a-z]","");
                    set.add(a);
                }else{
                    String a = str.substring(0,index);
                    a = a.replaceAll("[^a-z]","");
                    set.add(a);   
                }
                map.put(s,set);
            }
            else{
                HashSet<String> set = new HashSet<>();
                int index = str.indexOf("+");
                if(index < 0){
                    String a = str.substring(0,str.indexOf("@"));
                    a = a.replaceAll("[^a-z]","");
                    set.add(a);
                }else{
                    String a = str.substring(0,index);
                    a = a.replaceAll("[^a-z]","");
                    set.add(a);   
                }
                map.put(s,set);
            }
        }
        int count = 0;
        for(Map.Entry<String, HashSet<String>> entry : map.entrySet()){
            count+=entry.getValue().size();
        }
        return count;
    }
}