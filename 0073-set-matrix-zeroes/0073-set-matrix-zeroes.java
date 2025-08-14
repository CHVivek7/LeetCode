class Solution {
    public void setZeroes(int[][] arr) {
        int[][] res = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                res[i][j] = arr[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<arr.length;k++){
                        res[k][j] = 0;
                    }
                    for(int k=0;k<arr[0].length;k++){
                        res[i][k] = 0;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=res[i][j];
            }
            
        }
    }
}