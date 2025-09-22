class Solution {
    public int countPartitions(int[] arr) {
        int total = 0;
        for(int i = 0;i<arr.length;i++){
            total+=arr[i];
        }
        int sum = 0;
        int count = 0;
        for(int i = 0;i<arr.length-1;i++){
            total-=arr[i];
            sum+=arr[i];
            int n = Math.abs(total - sum);
            if(n % 2==0){
                count++;
            }
        }
        return count;
    }
}