class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> vowel = new HashMap<>();
        Map<Character,Integer> consonent = new HashMap<>();
        String v = "aeiouAEIOU";
        for(int i = 0;i<s.length();i++){
            if(v.contains(s.charAt(i)+"")){
                vowel.put(s.charAt(i),vowel.getOrDefault(s.charAt(i),0)+1);
            }else{
                consonent.put(s.charAt(i),consonent.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int vmax = 0;
        for(Map.Entry<Character,Integer> entry : vowel.entrySet()){
            vmax = Math.max(entry.getValue(),vmax);
        }
        int cmax = 0;
        for(Map.Entry<Character, Integer> entry : consonent.entrySet()){
            cmax = Math.max(entry.getValue(),cmax);
        }
        return vmax + cmax;
    }
}