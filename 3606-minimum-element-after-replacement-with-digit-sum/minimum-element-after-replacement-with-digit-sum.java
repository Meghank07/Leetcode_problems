class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int n : nums){
            int digit = 0;
            while(n>0){
                digit += n%10;
                n = n/10;
            }
            ans = Math.min(ans,digit);
        }
        return ans;
    }
   
}