class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int mid = 0;
        while(mid <= right){
            if(nums[mid]==0){
                swap(nums,left,mid);
                left++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,right,mid);
                right--;
            }
        }
        
    }
    private void swap(int[] nums , int left , int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}