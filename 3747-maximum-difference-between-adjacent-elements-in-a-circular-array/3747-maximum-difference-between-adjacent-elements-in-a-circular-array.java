class Solution {
    public int maxAdjacentDistance(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 1;i<=arr.length;i++){
            if(i == arr.length){
                max = Math.max(max, Math.abs(arr[i-1] - arr[0]));
            }else{
                max = Math.max(max, Math.abs(arr[i] -arr[i-1]));
            }
        }
        return max;
    }
}