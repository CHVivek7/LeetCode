class Solution {
    public boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        int i = 1;
        while(i<str.length()){
            if(str.charAt(i-1)==str.charAt(i)){
                return false;
            }
            i++;
        }
        return true;
    }
}