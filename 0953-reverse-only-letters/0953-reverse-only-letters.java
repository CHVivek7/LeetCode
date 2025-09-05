class Solution {
    public String reverseOnlyLetters(String str) {
        char[] ch = str.toCharArray();
        str = str.replaceAll("[^a-zA-Z]","");
        str = new StringBuilder(str).reverse().toString();
        int left = 0;
        for(int i = 0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                ch[i] = str.charAt(left);
                left++;
            }
        }
        return new String(ch);
    }
}