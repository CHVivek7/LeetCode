class Solution {
    public String decodeAtIndex(String s, int k) {
        long len = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int d = c - '0';
                len *= d;
            } else {
                len += 1;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int d = c - '0';
                len /= d;
                k = (int) ((k - 1) % len + 1);
            } else {
                if (k == len) {
                    return Character.toString(c);
                }
                len -= 1;
            }
        }
        return "";
    }
}