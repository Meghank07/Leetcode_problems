class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landtime = Integer.MAX_VALUE;
        int watertime = Integer.MAX_VALUE;
        int ans  = Integer.MAX_VALUE;
        for(int i = 0 ; i < landStartTime.length ; i++){
            int landride = landStartTime[i] + landDuration[i];
           for(int j = 0 ; j < waterStartTime.length ; j++){
               int waterride = waterStartTime[j] + waterDuration[j];

               int landtotaltime = Math.max(landride,waterStartTime[j]) + waterDuration[j];

               int watertotaltime = Math.max(waterride,landStartTime[i])+ landDuration[i];

               int minlandtime = Math.min(landtotaltime,watertotaltime);

              ans = Math.min(ans, minlandtime);
           }
        }
       
         
        
        return ans;

    }
}