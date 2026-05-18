class Solution {
    public char findTheDifference(String s, String t) {
         char result = 0;
         for(int i = 0 ; i < s.length() ; i++){
             result ^= s.charAt(i);
         }
         for(int j = 0 ; j < t.length() ; j++){
            result ^=  t.charAt(j);
         }
         return result;
    }

}