class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int mid =-1;
        if(x==0 || x==1) return x;

        while(left<=right){
            mid = left + (right-left)/2;

            if((long) mid*mid > x){
                right = mid-1;
            }
            else if((long) mid*mid == x){
                return mid;
            }
            else{
                left = mid +1;
            }
        }
        return Math.round(right);
    }
}