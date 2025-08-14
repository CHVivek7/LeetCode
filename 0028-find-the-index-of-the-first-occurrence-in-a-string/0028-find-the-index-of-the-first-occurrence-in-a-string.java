class Solution {
    public int strStr(String s, String t) {
        int n = t.length();
        for (int i = 0; i < s.length() - n + 1; i++) {
            if (s.substring(i, i + n).equals(t)) {
                return i;
            }
        }
        return -1;
    }
}