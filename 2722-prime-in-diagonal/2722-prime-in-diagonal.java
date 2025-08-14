class Solution {
    public int diagonalPrime(int[][] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i][i]>res && isPrime(nums[i][i])){
                res=nums[i][i];
            }
            if(nums[i][nums.length-1-i] > res && isPrime(nums[i][nums.length-1-i])){
                res=nums[i][nums.length-1-i];
            }
        }
        return res;
    }
    boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}