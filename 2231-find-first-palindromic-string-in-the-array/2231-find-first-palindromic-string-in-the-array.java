class Solution {
    public String firstPalindrome(String[] words) {
        for(String str : words){
            if(palindrome(str)){
                return str;
            }
        }
        return "";
    }
    public boolean palindrome(String str){
        String newStr = new StringBuilder(str).reverse().toString();
        if(str.equals(newStr)){
            return true;
        }
        return false;
    }
}