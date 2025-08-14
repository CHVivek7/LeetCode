class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(sArr[i])) {
                if (map.get(sArr[i]) != tArr[i]) {
                    return false; 
                }
            } else {
                if (map.containsValue(tArr[i])) {
                    return false; 
                }
                map.put(sArr[i], tArr[i]);
            }
        }
        return true;
    }
}