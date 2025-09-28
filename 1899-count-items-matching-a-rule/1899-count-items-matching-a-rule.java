class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        List<String> list = new ArrayList<>(Arrays.asList("type","color","name"));
        int count = 0;
        int x = list.indexOf(ruleKey);
        for(int i = 0;i<items.size();i++){
            List<String> l = items.get(i);
            
            if(l.get(x).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}