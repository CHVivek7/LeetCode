class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int prod = 1;
        int sum = 0;
        while(temp > 0){
            prod *= temp % 10;
            sum += temp % 10;
            temp /= 10;
        }
        return (prod - sum);
    }
}