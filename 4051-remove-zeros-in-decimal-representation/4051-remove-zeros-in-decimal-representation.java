class Solution {
    public long removeZeros(long n) {
        String str = n +"";
        str = str.replaceAll("0","");
        return Long.parseLong(str);
    }
}