class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int slow = 0; 
        int fast = n-1;
        while(slow<fast){
            if(s.charAt(slow)!= s.charAt(fast)){
                return Palindrome(s,slow+1,fast) || Palindrome(s,slow,fast-1);
            }
            slow++;
            fast--;
        }
        return true;
    }
    private boolean Palindrome(String s , int slow , int fast){
      while(slow<fast){
            if(s.charAt(slow)!= s.charAt(fast)){
                return false;
            }
            slow++;
            fast--;
        }
        return true;   
    }
}