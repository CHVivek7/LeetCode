import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str = s.toCharArray();
        char[] str1 = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(str1);
        return Arrays.equals(str,str1);
    }
}