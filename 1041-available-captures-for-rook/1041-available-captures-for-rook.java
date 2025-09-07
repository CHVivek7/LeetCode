class Solution {
    public int numRookCaptures(char[][] ch) {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                if (ch[i][j] == 'R') {
                    if (up(ch, i, j)) count++;
                    if (down(ch, i, j)) count++;
                    if (left(ch, i, j)) count++;
                    if (right(ch, i, j)) count++;
                }
            }
        }
        return count;
    }

    public static boolean up(char[][] ch, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (ch[i][col] == 'p') {
                return true;
            } else if (ch[i][col] == '.') {
                continue;
            } else {
                // 다른 문자면 막힘
                return false;
            }
        }
        return false;
    }

    public static boolean down(char[][] ch, int row, int col) {
        for (int i = row + 1; i < ch.length; i++) {
            if (ch[i][col] == 'p') {
                return true;
            } else if (ch[i][col] == '.') {
                continue;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean left(char[][] ch, int row, int col) {
        for (int j = col - 1; j >= 0; j--) {
            if (ch[row][j] == 'p') {
                return true;
            } else if (ch[row][j] == '.') {
                continue;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean right(char[][] ch, int row, int col) {
        for (int j = col + 1; j < ch[0].length; j++) {
            if (ch[row][j] == 'p') {
                return true;
            } else if (ch[row][j] == '.') {
                continue;
            } else {
                return false;
            }
        }
        return false;
    }
}