class Solution {
    public int countDigits(int num) {
        int temp = num;
        int count = 0;
        while(temp > 0){
            int x = temp % 10;
            if(num % x == 0){
                count++;
            }
            temp /= 10;
        }
        return count;
    }
}