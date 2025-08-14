class Solution {
    public String licenseKeyFormatting(String s, int n) {
        String str = new StringBuilder(s.replaceAll("-", "")).reverse().toString();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i % n == 0) {
                result.append('-');
            }
            result.append(str.charAt(i));
        }

        return result.reverse().toString().toUpperCase();
    }
}