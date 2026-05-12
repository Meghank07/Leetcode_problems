class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int n : nums){
            List<Integer> reversed_digits = new ArrayList<>();
            while(n>0){
                reversed_digits.add(n%10);
                n = n/10;

            }
            for(int i = reversed_digits.size()-1 ; i >= 0 ; i--){
                 ans.add(reversed_digits.get(i));
            }
        }
        int array[] = new int[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++){
            array[i] = ans.get(i);
        }
        return array;
        
    }
}