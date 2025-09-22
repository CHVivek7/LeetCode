class Solution {
    public int minimumOperations(int[] arr) {
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            int rem = arr[i] % 3;
            if(rem !=0){
                sum+=1;
            }
        }
        return sum;
    }
}