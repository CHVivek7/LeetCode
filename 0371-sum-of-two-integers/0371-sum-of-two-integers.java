class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int sum = a ^ b;      // sum bits without carries
            int carry = (a & b) << 1; 
            a = sum;
            b = carry;
        }
        return a;
    }
}