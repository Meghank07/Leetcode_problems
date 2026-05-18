class Solution {
    public int singleNumber(int[] nums) {
        int num1 = 0 ;
        int num2 =0;
        for(int n : nums){
            num1 = (num1 ^ n) & ~num2;
            num2 = (num2 ^ n) & ~num1;
        }
        return num1;
    }
}