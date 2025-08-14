class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split("\\s+");
        HashMap<Character, String> map = new HashMap<>();
        if(pattern.length() != arr.length){
            return false;
        }
        HashSet<String> used = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            char c = pattern.charAt(i);
            String w = arr[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(w)){
                    return false;
                }
            }
            else{
                if(used.contains(w)){
                    return false;
                }
                map.put(c,w);
                used.add(w);
            }
        }
        return true;
    }
}