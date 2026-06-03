class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < numCourses; i++){
            list.add(new ArrayList<>());
        }
        for(int[] ad : prerequisites){
            list.get(ad[0]).add(ad[1]);
        }
        int[] state = new int[numCourses];
        for(int i = 0 ; i < numCourses ; i++){
            if(state[i]==0){
                if(dfs(i,list,state)){
                    return false;
                }
            }
        }
        return true;

    }
    private boolean dfs(int course , List<List<Integer>> lst , int[] state ){
        state[course] = 1;
        for(int innext : lst.get(course)){
            if(state[innext]==1){
                return true;
            }
            else if(state[innext]==0){
                if(dfs(innext,lst,state)){
                    return true;
                }
            }
        
        }
         state[course]=2;
          return false;

    }

}