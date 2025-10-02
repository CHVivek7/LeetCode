class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[grid.length * grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                arr[grid[i][j]-1]++;
            }
        }
        int[] ans = new int[2];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==2){
                ans[0] = i+1;
            }
            if(arr[i] == 0){
                ans[1] = i+1;
            }
            if(ans[0] != 0 && ans[1]!=0){
                return ans;
            }
        }
        return ans;
    }
}