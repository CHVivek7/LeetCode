class Solution {
    public String truncateSentence(String s, int k) {
        String res = "";
        String[] str = s.split(" ");
        for(int i = 0;i<k;i++){
            res += str[i]+" ";
        }
        return res.substring(0,res.length()-1);
    }
}