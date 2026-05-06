class Solution {
    public boolean isPalindrome(int x) {
       int new_number = x;
       int reverse_num = 0;
       if(x<0){
        return false;
       }
       while(x!=0){
          int a = x%10;
          reverse_num = reverse_num*10 + a;
          x = x/10;
       }
       
      return new_number == reverse_num;
        
    }
}