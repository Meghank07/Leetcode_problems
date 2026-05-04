class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        if(n==0 || m==0) return;
        HashSet<Integer> firstset = new HashSet<>();
        HashSet<Integer> secondset = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j]==0){
                     firstset.add(i);
                     secondset.add(j);
                }
            }
        }
        
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m; j++){
                if(firstset.contains(i) || secondset.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}