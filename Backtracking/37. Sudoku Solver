class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }
    public boolean helper(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] == '.')
                {
                    for(char k='1';k<='9';k++)
                    {
                        if(isValid(board,k,i,j))
                        {
                            board[i][j] = k;
                            if(helper(board))
                            {
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] b,char k,int r,int c)
    {
        for(int i=0;i<9;i++)
        {
            if(b[r][i] == k)
            {
                return false;
            }
            if(b[i][c] == k)
            {
                return false;
            }
            if(b[3 * (r / 3) + i / 3][3 * (c / 3) + i % 3] == k)
            {
                return false;
            }
        }
        return true;
    }
}
