class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer> res = new ArrayList<>();
        int[] color = new int[n];
        for(int i = 0 ; i < n ;i++){
            if(dfs(graph,i,color)){
                res.add(i);
            }
        }
        return res;
    }
    private boolean dfs(int[][] graph , int node , int[] color ){
        
         if(color[node]==2) return true;
         if(color[node]==1) return false;
         color[node] = 1;
         for(int d : graph[node]){
          
             if(!dfs(graph,d,color)){
                return false;
             }
         }
         color[node]=2;

         return true;
    }
}