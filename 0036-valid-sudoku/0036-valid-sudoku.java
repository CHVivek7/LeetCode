class Solution {
    public boolean isValidSudoku(char[][] n) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> col = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (n[i][j] != '.' && !row.add(n[i][j]))
                    return false;
                if (n[j][i] != '.' && !col.add(n[j][i]))
                    return false;
                int rowIndex = 3 * (i / 3) + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;
                if (n[rowIndex][colIndex] != '.' && !cube.add(n[rowIndex][colIndex]))
                    return false;
            }
        }
        return true;
    }
}