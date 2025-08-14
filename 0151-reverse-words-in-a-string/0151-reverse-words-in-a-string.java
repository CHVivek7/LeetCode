class Solution {
    public String reverseWords(String str) {
        String[] words = str.trim().split("\\s+");
        String rev = "";
        for(int i=words.length-1;i>0;i--){
            rev+=words[i]+" ";
        }
        rev+=words[0];
        return rev;
    }
}