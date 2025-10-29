class Solution {
    public int smallestNumber(int n) {
        while(true){
            String str = Integer.toBinaryString(n);
            if(str.contains("1") && str.contains("0")){
                n+=1;
                continue;
            }
            else{
                break;
            }
        }
        return n;
    }
}