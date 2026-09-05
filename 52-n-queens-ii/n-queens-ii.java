class Solution {
    public int totalNQueens(int n) {
         List<List<String>> ans=new ArrayList<>();
         List<String> board=new ArrayList<>();
         int op=0;
         String str="";
         for(int i=0;i<n;i++){
            str=str+".";
         }
         for(int i=0;i<n;i++){
            board.add(str);
         }
        op= func(0,board,ans,n);
         return op;
 }
 private int func(int row, List<String> board,  List<List<String>> ans,int n){
    int cnt=0;
    if(row==n){
        ans.add(new ArrayList<>(board));
        return 1;
    }
    for(int col=0;col<n;col++){
        if(placingIsPossible(board,row,col,n)){
             char[] rowArr = board.get(row).toCharArray();
                rowArr[col] = 'Q';
                board.set(row, new String(rowArr));
               cnt+= func(row + 1, board, ans,n);
                  rowArr[col] = '.';
                board.set(row, new String(rowArr));
        }
    }
    return cnt;
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
