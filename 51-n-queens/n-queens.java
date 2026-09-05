class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> ans=new ArrayList<>();
         List<String> board=new ArrayList<>();
         String str="";
         for(int i=0;i<n;i++){
            str=str+".";
         }
         for(int i=0;i<n;i++){
            board.add(str);
         }
         func(0,board,ans,n);
         return ans;
 }
 private void func(int row, List<String> board,  List<List<String>> ans,int n){
    if(row==n){
        ans.add(new ArrayList<>(board));
        return;
    }
    for(int col=0;col<n;col++){
        if(placingIsPossible(board,row,col,n)){
             char[] rowArr = board.get(row).toCharArray();
                rowArr[col] = 'Q';
                board.set(row, new String(rowArr));
                func(row + 1, board, ans,n);
                  rowArr[col] = '.';
                board.set(row, new String(rowArr));
        }
    }
 }
 private boolean placingIsPossible(List<String> board,int row,int col,int n){
    int r,c;
     r=row-1;
    while(r>=0){
        if(board.get(r).charAt(col)=='Q')return false;
        r--;
    }
     r=row-1;
     c=col+1;
     while(r>=0 && c<n){
        if(board.get(r).charAt(c)=='Q')return false;
        r--;
        c++;
    }
    r=row-1;
    c=col-1;
     while(r>=0 && c>=0){
        if(board.get(r).charAt(c)=='Q')return false;
        r--;
        c--;
    }
    return true;
 }
}