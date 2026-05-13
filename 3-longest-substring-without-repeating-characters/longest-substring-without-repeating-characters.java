class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0;
        int left=0;
        int right = 0;
        HashSet<Character> hs = new HashSet<>();
        while(right < s.length()){
            char current = s.charAt(right);
            while(hs.contains(current)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(current);
            max_len=Math.max(max_len,right-left+1);
            
            right++;
        }
        return max_len;
    }
}