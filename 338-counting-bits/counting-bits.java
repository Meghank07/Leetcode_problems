class Solution {
    public int[] countBits(int n) {
        int[] counts = new int[n+1];
        counts[0]=0;
        for(int i =  0; i <n+1; i++){
            counts[i] = counts[i/2] + (i%2);
        }
        return counts;
    }
}