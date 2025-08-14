class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length;i++){
            ans.append(new StringBuilder(str[i]).reverse());
            ans.append(" ");
            
        }
        return ans.toString().substring(0,ans.length()-1);
    }
}