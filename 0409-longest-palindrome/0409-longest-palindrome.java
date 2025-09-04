class Solution {
    public int longestPalindrome(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 0){
                sum+=entry.getValue();
            }else{
                sum+=(entry.getValue()-1);
                list.add(entry.getValue());
            }
        }
        if(!list.isEmpty()){
            return ++sum;
        }
        return sum;
    }
}