class Solution{
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] copyBoard = new int[m][n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                copyBoard[r][c] = board[r][c];
            }
        }
        
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int liveNeighbors = 0;
                
                for (int i = 0; i < 8; i++) {
                    int nr = r + dr[i];
                    int nc = c + dc[i];
                    
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && copyBoard[nr][nc] == 1) {
                        liveNeighbors++;
                    }
                }
                if (copyBoard[r][c] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        board[r][c] = 0; 
                    }
                } else {
                    if (liveNeighbors == 3) {
                        board[r][c] = 1; 
                    }
                }
            }
        }
    }
}