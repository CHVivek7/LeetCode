/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        Map<Integer, Character> letterMap = new HashMap<>();  
        
        for (int i = 1; i <= 26; i++) {  
            letterMap.put(i, (char) ('A' + i - 1));  
        }  
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            int remainder = columnNumber % 26;
            if (remainder == 0) {
                sb.append('Z');
                columnNumber = columnNumber / 26 - 1;
            } else {
                sb.append(letterMap.get(remainder));
                columnNumber = columnNumber / 26;
            }
        }
        return sb.reverse().toString();
    }
}

