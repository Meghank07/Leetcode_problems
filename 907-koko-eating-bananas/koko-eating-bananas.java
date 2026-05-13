class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int sum = 0;
        int k = 0;
        int ans = 0;
        for(int p : piles){
            sum += p;
        }
        int max = 0;
        for(int q : piles){
            max = Math.max(max,q);
        }
        int low = 1;
       
      
        while(low<=max){
            int middlespeed= low + (max-low)/2;
            long totalhours = 0;
            for(int i = 0; i < n ;i++){
                totalhours += (piles[i]+middlespeed-1)/middlespeed;
            }
            if(totalhours <= h){
                
                max = middlespeed-1;
                ans = middlespeed;
            }
            else{
                low = middlespeed+1;
            }
        }
        return ans;
    }
}