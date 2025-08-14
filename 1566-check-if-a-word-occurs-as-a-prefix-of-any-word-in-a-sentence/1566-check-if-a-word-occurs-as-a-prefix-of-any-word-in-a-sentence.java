class Solution {
    public int isPrefixOfWord(String str, String prefix) {
        int n = prefix.length();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if(s[i].startsWith(prefix)){
                return i+1;
            }
        }
        return -1;
    }
}