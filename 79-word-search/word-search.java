class Solution {
    public boolean exist(char[][] board, String word) {
         for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if (board[i][j] == word.charAt(0)) {
                if (func(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
    }
    return false;
        
    }
    private boolean func(char[][] board, int i, int j, String word, int ind) {
      if (ind == word.length()) {
        return true;
      }
            
       if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
        return false;
    }
   
    if (  board[i][j] == ' ' || word.charAt(ind) != board[i][j]) {
        return false;
    }
    char temp = board[i][j];
    board[i][j] = ' ';
    boolean ans = func(board, i + 1, j, word, ind + 1) ||
                  func(board, i - 1, j, word, ind + 1) ||
                  func(board, i, j + 1, word, ind + 1) ||
                  func(board, i, j - 1, word, ind + 1);
    board[i][j] = temp;

    return ans;
}
}