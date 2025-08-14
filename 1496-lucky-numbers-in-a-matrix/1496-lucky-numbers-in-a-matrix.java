class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int min = matrix[i][j];
                int max = matrix[i][j];
                for(int k=0;k<matrix[0].length;k++){
                    if(matrix[i][k]<min){
                        min = matrix[i][k];
                    }
                }
                for(int k=0;k<matrix.length;k++){
                    if(matrix[k][j]>max){
                        max = matrix[k][j];
                    }
                }
                if(min==max){
                    list.add(min);
                }
            }
        }
        return list;  
    }
}