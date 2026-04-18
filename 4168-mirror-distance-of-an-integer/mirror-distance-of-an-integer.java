class Solution {
    public int mirrorDistance(int n) {
        int rev_number = 0;
        int p = n;
        while(n!=0){
            int last_digit = n%10;
            rev_number = (rev_number*10) + last_digit;
            n = n/10;
        }
        return Math.abs(rev_number - p);
    }
}