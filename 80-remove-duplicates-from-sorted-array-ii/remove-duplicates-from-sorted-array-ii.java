class Solution {
    public int removeDuplicates(int[] nums) {
      int n = nums.length;
      List<Integer> lst = new ArrayList<>();
      int k =2;
      Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 2 ; i < n ;i++){
            if(nums[i] != nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
            
        }
        return k;

      
    }
}