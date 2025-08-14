import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> indexMap2 = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            indexMap2.put(list2[i], i);
        }

        List<String> answer = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            String restaurant = list1[i];
            if (indexMap2.containsKey(restaurant)) {
                int sum = i + indexMap2.get(restaurant);
                if (sum < minSum) {
                    minSum = sum;
                    answer.clear(); // Clear previous entries
                    answer.add(restaurant);
                } else if (sum == minSum) {
                    answer.add(restaurant);
                }
            }
        }

        return answer.toArray(new String[0]);
    }
}