class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int slow = 0 ;
    
        for(int fast = 0 ; fast < n ; fast++){
            if(nums[fast]!=0){
                swap(nums,slow,fast);
                slow++;
            }
            
        }

        
    }
    private void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}