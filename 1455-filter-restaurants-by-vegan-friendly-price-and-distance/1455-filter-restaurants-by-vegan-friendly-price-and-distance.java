import java.util.stream.Collectors;
class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int[] arr : restaurants){
            if((veganFriendly == 0 || arr[2] == 1) && (arr[3]<=maxPrice) && (arr[4]<=maxDistance)){
                map.put(arr[0],arr[1]);
            }
        }
        LinkedHashMap<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                // Sort by Value (rating) descending, then by Key (ID) descending for ties.
                .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder())))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        return new ArrayList<>(sortedMap.keySet());
    }
}