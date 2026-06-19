class Solution {
    public int largestAltitude(int[] gain){
        int altitude = 0;
        int total_gain = altitude;
        for(int net_gain : gain){
             total_gain += net_gain;

            altitude = Math.max(altitude,total_gain);
        }
        return altitude;
    }
}