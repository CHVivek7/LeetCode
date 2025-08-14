class Solution {
    public String mergeAlternately(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < str1.length() || j < str2.length()) {
            if (i < str1.length()) {
                result.append(str1.charAt(i));
                i++;
            }
            if (j < str2.length()) {
                result.append(str2.charAt(j));
                j++;
            }
        }

        return result.toString();

    }
}