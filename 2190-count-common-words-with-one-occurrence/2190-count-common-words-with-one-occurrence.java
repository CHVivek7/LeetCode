class Solution {
    public int countWords(String[] words1, String[] words2) {
        int n = words1.length;
        int m = words2.length;
        int count=0;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map1.containsKey(words1[i])){
                map1.put(words1[i], map1.get(words1[i])+1);
            }
            else{
                map1.put(words1[i],1);
            }
        }
        for(int i=0;i<m;i++){
            if(map2.containsKey(words2[i])){
                map2.put(words2[i], map2.get(words2[i])+1);
            }
            else{
                map2.put(words2[i],1);
            }
        }
        for(String word: map1.keySet()){
            if(map1.get(word)==1 && map2.containsKey(word) && map2.get(word)==1){
                count++;
            }
        }
        return count;

    }
}