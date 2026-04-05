class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int left = 0;
        int right = 0;
        for(char c : moves.toCharArray()){
            if(c == 'L') left--;
           else if(c=='R') left++;
            else if(c=='U') right++;
            else if(c == 'D') right--;

        }
        return left==0 && right==0;

    }
}