class Solution {
    public boolean isValidSudoku(char[][] board) {
     for (int i = 0; i < 9; i++) {
    for (int j = 0; j < 9; j++) {
if (board[i][j] == '.') {
    continue;
    }
  char num = board[i][j];
for (int k = 0; k < 9; k++) {
if (k != j && board[i][k] == num)
return false;
 }
 for (int k = 0; k < 9; k++) {
if (k != i && board[k][j] == num)
return false;
}
int row = (i / 3) * 3;
 int col = (j / 3) * 3;
 for (int r = row; r < row + 3; r++) {
 for (int c = col; c < col + 3; c++) {
if ((r != i || c != j) && board[r][c] == num)
return false;
}
}
}
}
return true;
}
}