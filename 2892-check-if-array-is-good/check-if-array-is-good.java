class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int max = n-1;
        Arrays.sort(nums);
        if(n<2) return false;
        for(int i = 0; i < n-1 ;i++){
            if(nums[i]!= i+1){
                return false;
            }
        }
        return nums[n-1] == max;
    }
}