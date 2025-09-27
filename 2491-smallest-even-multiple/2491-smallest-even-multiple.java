class Solution {
    public int smallestEvenMultiple(int n) {
        return (2 * n)/gcd(2,n);
    }
    public int gcd(int a, int b){
        while(b != 0){
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}