class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max_dis = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j<n;j++){
                if(colors[i]!=colors[j]){
                    max_dis = Math.max(max_dis,j-i);
                }
            }
        }
        return max_dis;
    }
}