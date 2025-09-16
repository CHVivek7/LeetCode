class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = -1;
        int oddsum = 0;
        int even= 0;
        int evensum = 0;
        int count = n;
        while(count-- > 0){
            odd +=2;
            oddsum += odd;
        }
        count = n;
        while(count-- > 0){
            even +=2;
            evensum += even;
        }
        return gcd(oddsum, evensum);
    }
    public int gcd(int a,int b){
        while(b!=0){
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}