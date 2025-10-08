class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new TreeMap<>();
        for(int i = 0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<String> result = new ArrayList<>(map.keySet());

        Collections.sort(result, (a, b) -> {
            int freqComparison = map.get(b).compareTo(map.get(a));
            if (freqComparison == 0) {
                return a.compareTo(b);
            }
            
            return freqComparison;
        });
        return result.subList(0, k);
    }
}