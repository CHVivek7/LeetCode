class Solution {
    public String convertDateToBinary(String date) {
        String[] str = date.split("-");
        String ans = "";
        for(int i = 0 ;i<str.length;i++){
            int n = Integer.parseInt(str[i]);
            ans += (Integer.toBinaryString(n)+"-");
        }
        return ans.substring(0,ans.length()-1);
    }
}