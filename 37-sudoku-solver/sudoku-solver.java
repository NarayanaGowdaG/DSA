class Solution {

public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char[][] board) {
 int n = 9;  
 for (int i = 0; i < n; i++) {
 for (int j = 0; j < n; j++) {
    if (board[i][j] == '.') {  
for (char digit = '1'; digit <= '9'; digit++) {
  if (areRulesMet(board, i, j, digit)) {  
 board[i][j] = digit;  
 boolean val=solve(board); 
if(val) return true;
board[i][j] = '.';  
 }  
  }
  return false;
 } 
}
}
return true;  
    }

    private boolean areRulesMet(char[][] board, int row, int col, char digit) {
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit) {
                return false;  
            }
            if(board[i][col] == digit){
                return false;
            }
        
        if (board[startRow+i/3][startCol+i%3] == digit) {
                    return false;  
                }
            }
        
        return true;  
    }
}
