class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] col = new int[matrix[0].length];
        for(int i =0;i<matrix[0].length;i++){
            int max = 0;
            for(int j = 0; j<matrix.length;j++){
                max = Math.max(max, matrix[j][i]);
            }
            col[i] = max;
        }
        
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = col[j];
                }
            }
        }
        return matrix;
    }
}