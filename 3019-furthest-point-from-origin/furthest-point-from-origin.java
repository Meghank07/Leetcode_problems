class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int count_l = 0;
        int count_r = 0;
        int count_ = 0;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            if(moves.charAt(i)=='R'){
                count_r++;
            }
            else if(moves.charAt(i)=='L'){
                count_l++;
            }
            else{
                count_++;
            }
            
        }
        int min = 0;
        if(count_l !=0 && count_r!=0){
            min = Math.min(count_l,count_r);
           return  ans = n - (2*min);
        }
        return count_+count_r+count_l;
    }
}