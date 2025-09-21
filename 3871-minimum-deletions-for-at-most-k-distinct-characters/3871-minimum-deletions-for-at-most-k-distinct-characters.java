import java.util.*;
class Solution {
    public int minDeletion(String str, int k) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        Collection<Integer> values = map.values();
        List<Integer> list = new ArrayList<>(values);
        int sum=0;
        Collections.sort(list);
        Collections.reverse(list);
        for(int i = k;i<list.size();i++){
            sum+=list.get(i);
            //list.remove(0);
        }
        return sum;
    }
}