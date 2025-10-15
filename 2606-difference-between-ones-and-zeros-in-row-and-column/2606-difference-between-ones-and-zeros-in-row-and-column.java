class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int i = 0;
        int[] rowsOnes = new int[grid.length];
        int[] rowsZeros = new int[grid.length];
        int[] colsOnes = new int[grid[0].length];
        int[] colsZeros = new int[grid[0].length];
        for(int[] j: grid){
            String str = Arrays.toString(j);
            str = str.replaceAll("[^1]","");
            rowsOnes[i] = str.length();
            str = Arrays.toString(j);
            str = str.replaceAll("[^0]","");
            rowsZeros[i] = str.length();
            i++;
        }
        for(int j = 0;j<grid[0].length;j++){
            int sumOne = 0;
            int sumZero = 0;
            for(int k=0;k<grid.length;k++){
                if(grid[k][j] == 1){
                    sumOne++;
                }
                else{
                    sumZero++;
                }
            }
            colsOnes[j] = sumOne;
            colsZeros[j] = sumZero;
        }
        for(i =0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                grid[i][j] = rowsOnes[i] + colsOnes[j] - rowsZeros[i] - colsZeros[j];
            }
        }
        return grid;
    }
}