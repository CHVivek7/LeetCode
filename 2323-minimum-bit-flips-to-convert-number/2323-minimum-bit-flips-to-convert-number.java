class Solution {
    public int minBitFlips(int start, int goal) {
        String a = Integer.toBinaryString(start);
        String b = Integer.toBinaryString(goal);
        if(a.length()!=b.length()){
            while(a.length()!=b.length()){
                if(a.length()>b.length()){
                    b = "0"+b;
                }else{
                    a = "0"+a;
                }
            }
        }
        int count = 0;
        int i = 0;
        while(i<a.length()){
            if(a.charAt(i) != b.charAt(i)){
                count++;
            }
            i++;
        }
        return count;
    }
}