class Solution {
    public void rotate(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        for(int i=matrix.length-1; i>=0; i--) {
            for(int j=0; j<matrix[0].length; j++) {
                res[j][matrix.length-1-i] = matrix[i][j];
            }
        }
        System.out.println("Original Matrix:");
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                matrix[i][j]=res[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}