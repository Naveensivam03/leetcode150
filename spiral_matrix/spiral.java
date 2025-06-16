class Solution{
  public List<Integer> spiralMatrix(int[][] board){

    int n  = board.length;
    int m = board[0].length;
    int[] s =int [m*n];
    int row =0;
    int col =0;


    while(!m=0 || !n=0){
    //right movement:
    for (int i =0; i < m;i++){
        s[i] = board[row][i];
        n-=1;
        col = i;
    }

    //bottom movement:
    for (int i =0; i<n;i++){
      s.add(board[i][col]);
      m-=1;
      row = i;
    }

    //left movement;
    for (int i =0;i<m;i--){
      s.add(board[row][i]);
      n-=1;
      col  = i;
    }

    //top movement:
    for(int i =0; i <n;i--){
      s.add(board[i][col]);
      m-=1;
      row=i;
    }

  }
  return s;
  }
}
