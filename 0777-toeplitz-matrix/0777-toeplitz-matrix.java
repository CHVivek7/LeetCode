class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix.length == 1 || matrix[0].length == 1) {
            return true;
        }
        for (int j = 0; j < matrix[0].length - 1; j++) {
            if (!side(matrix, 0, j)) {
                return false;
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            if (!side(matrix, i, 0)) {
                return false;
            }
        }

        return true;
    }

    private boolean side(int[][] matrix, int i, int j) {
        while (i < matrix.length - 1 && j < matrix[0].length - 1) {
            if (matrix[i][j] != matrix[i + 1][j + 1]) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}