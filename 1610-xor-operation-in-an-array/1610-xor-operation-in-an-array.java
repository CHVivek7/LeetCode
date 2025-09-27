class Solution {
    public int xorOperation(int n, int start) {
        int sum = 0;
        while(n-- > 0){
            sum ^= start;
            start+=2;
        }
        return sum;
    }
}