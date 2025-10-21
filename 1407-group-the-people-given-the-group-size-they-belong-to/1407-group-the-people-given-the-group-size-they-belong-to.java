class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for(int i = 0;i<groupSizes.length;i++){
            List<Integer> list = map.getOrDefault(groupSizes[i],new ArrayList<>());
            list.add(i);
            map.put(groupSizes[i],list);
        }
        List<List<Integer>> result = new ArrayList<>();
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            if(entry.getKey() == entry.getValue().size()){
                result.add(entry.getValue());
            }else{
                for(int i = 0;i<entry.getValue().size();){
                    result.add(entry.getValue().subList(i,i+entry.getKey()));
                    i += entry.getKey();
                }
            }
        }
        return result;
    }
}