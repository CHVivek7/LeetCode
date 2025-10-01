class Solution {
    public int pivotInteger(int n) {
        int sum = 0;
        while(n > 0){
            sum+=n;
            int x = (n * ( n + 1)) / 2;
            if(x == sum){
                return n;
            }
            n--;
        }
        return -1;
    }
}