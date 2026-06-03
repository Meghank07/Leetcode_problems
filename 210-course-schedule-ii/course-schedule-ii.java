class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < numCourses ; i++){
            list.add(new ArrayList<>());
        }
        for(int[] ad : prerequisites){
            list.get(ad[1]).add(ad[0]);
        }
        List<Integer> res = new ArrayList<>();
        int [] state = new int[numCourses];
        for(int i = 0 ; i < numCourses ; i++){
            if(state[i]==0){
                if(dfs(i,list,state,res)){
                    return new int[0];
                }
            }
        }
        int[] ans = new int[numCourses];
        for(int i = 0 ; i < numCourses ; i++){
            ans[i] = res.get(numCourses-1-i);
        }
        return ans;

    }
    private boolean dfs(int node , List<List<Integer>> lst , int[] state , List<Integer> result){
          if(state[node]==1) return true;
          if(state[node]==2) return false;

          state[node]=1;
          for(int next : lst.get(node)){
             
                if(dfs(next,lst,state,result)){
                   
                    return true;
                }
             
          }
          state[node]=2;
          result.add(node);
          return false;
    }
}