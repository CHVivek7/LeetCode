class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(ch+"")){
            return word;
        }
        int x = word.indexOf(ch);
        String str = new StringBuilder(word.substring(0,x+1)).reverse().toString();
        return str+word.substring(x+1);
    }
}