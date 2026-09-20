class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean row[][] = new boolean[9][9];
        boolean col[][] = new boolean[9][9];
        boolean box[][] = new boolean[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.')
                    continue;
                int digit = board[i][j] - '1';
                int index = (i / 3) * 3 + (j / 3);
                if (box[index][digit] || row[i][digit] || col[j][digit]) {
                    return false;
                }
                box[index][digit]=true;
                row[i][digit]=true;
                col[j][digit]=true;
            }
        }
        return true;
    }
}