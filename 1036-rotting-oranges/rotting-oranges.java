class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int n = grid.length;
        int m =grid[0].length;
        Queue<int[]> que = new LinkedList<>();
        int freshcount = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == 2){
                    que.offer(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    freshcount++;
                }
            }
        }
        int minutes = 0;
         int [][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
        while(!que.isEmpty() && freshcount>0){
            int size = que.size();
            minutes++;
           
            for(int i = 0 ; i < size ; i++){
                int[] mat = que.poll();

                for(int[] dir : direction){
                      int nrow = dir[0] + mat[0];
                      int ncol = dir[1] + mat[1];

                     if(nrow >= 0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1){
                         grid[nrow][ncol]=2;
                         freshcount--;
                         que.offer(new int[]{nrow,ncol});
                     }
                }
            }
        }
        return freshcount==0 ? minutes : -1;
        
    }
    
}