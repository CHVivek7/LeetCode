class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            sb.append(c);
            if (i + 1 < s.length()) {
                int shift = s.charAt(i + 1) - '0';
                char next = (char)(c + shift);
                sb.append(next);
            }
        }
        return sb.toString();
    }
}