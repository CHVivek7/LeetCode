class Solution {
    public int secondHighest(String s) {
        s = s.replaceAll("[^0-9]","");
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            set.add(s.charAt(i)-'0');
        }
        if(set.size()<2){
            return -1;
        }
        List<Integer> list = new ArrayList<>(set);
        return list.get(list.size()-2);
    }
}