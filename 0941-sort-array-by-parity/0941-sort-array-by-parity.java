class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int[] ans = new int[arr.length];
        int n = 0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                ans[n] = arr[i];
                n++;
            }
        }
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] % 2 == 1){
                ans[n++] = arr[i];
            }
        }
        return ans;
    }
}