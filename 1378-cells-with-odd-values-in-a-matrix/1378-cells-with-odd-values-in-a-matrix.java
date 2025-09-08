class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for(int[] a : indices){
            int x = a[0];
            int y = a[1];
            for(int i = 0; i<n;i++){
                arr[x][i]++;
            }
            for(int i = 0;i<m;i++){
                arr[i][y]++;
            }
        }
        int count = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(arr[i][j] %2 ==1){
                    count++;
                }
            }
        }
        return count;
    }
}