class Solution {
    boolean isValid(char[][] board, int r, int c, char ch){
        for(int i = 0; i < 9; i++){
            if(board[r][i] == ch && i != c){
                return false;
            }
            if(board[i][c] == ch && i != r){
                return false;
            }
            int nr = 3*(r/3) + i / 3;
            int nc = 3 * (c/3) + i%3;
            if(board[nr][nc] == ch && (nr != r || nc != c)){
                return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(!isValid(board, i, j, board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
