class Solution {
    public int titleToNumber(String columnTitle) {
        Map< Character, Integer> letterMap = new HashMap<>();  
        
        for (int i = 1; i <= 26; i++) {  
            letterMap.put( (char) ('A' + i - 1),i);  
        }
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + letterMap.get(columnTitle.charAt(i));
        }
        return result;
    }
}