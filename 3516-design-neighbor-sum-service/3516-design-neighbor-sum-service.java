import java.util.Arrays;

public class NeighborSum {
    private int[][] matrix;

    public NeighborSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            this.matrix = new int[0][0];
        } else {
            this.matrix = grid;
        }
    }

    private int[] findPosition(int value) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null || matrix[i].length == 0) continue;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == value) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public int adjacentSum(int value) {
        int[] pos = findPosition(value);
        int i = pos[0];
        int j = pos[1];

        if (i == -1) {
            return 0; 
        }
        int sum = 0;
        if (j - 1 >= 0) {
            sum += matrix[i][j - 1];
        }
        if (j + 1 < matrix[i].length) {
            sum += matrix[i][j + 1];
        }
        if (i - 1 >= 0 && j < matrix[i - 1].length) {
            sum += matrix[i - 1][j];
        }
        if (i + 1 < matrix.length && j < matrix[i + 1].length) {
            sum += matrix[i + 1][j];
        }

        return sum;
    }

    // Sum of the four diagonal neighbors around the found value
    public int diagonalSum(int value) {
        int[] pos = findPosition(value);
        int i = pos[0];
        int j = pos[1];

        if (i == -1) {
            return 0;
        }
        int sum = 0;
        if (i - 1 >= 0 && j - 1 >= 0) {
            sum += matrix[i - 1][j - 1];
        }
        if (i - 1 >= 0 && j + 1 < matrix[i - 1].length) {
            sum += matrix[i - 1][j + 1];
        }
        if (i + 1 < matrix.length && j - 1 >= 0) {
            sum += matrix[i + 1][j - 1];
        }
        if (i + 1 < matrix.length && j + 1 < matrix[i + 1].length) {
            sum += matrix[i + 1][j + 1];
        }
        return sum;
    }
}