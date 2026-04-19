class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int slow = 0;
        int fast = 0;
        int max_distance = 0;
        while(slow<nums1.length && fast<nums2.length){
            if(nums2[fast]>=nums1[slow]){
                max_distance = Math.max(max_distance,fast-slow);
                fast++;
            }
            else{
                slow++;
            }
        }
        return max_distance;
    }
}