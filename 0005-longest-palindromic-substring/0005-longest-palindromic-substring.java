class Solution {
    public String longestPalindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) { 
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if (isPalindrome(temp)) {
                    if (temp.length() > str.length()) {
                        str = temp;
                    }
                }
            }
        }
        return str; 
    }

    public boolean isPalindrome(String temp) {
        int i = 0;
        int j = temp.length() - 1;
        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}