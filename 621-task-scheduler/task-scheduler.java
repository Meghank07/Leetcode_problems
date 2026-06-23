class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequencies = new int[26];
        for(char task : tasks){
            frequencies[task-'A']++;
        }
        int maxfreq=0;
        for(int freq : frequencies){
            maxfreq = Math.max(maxfreq,freq);
        }
        int maxfreqcount = 0;
        for(int freq : frequencies){
            if(freq == maxfreq){
                maxfreqcount++;
            }
        }
        return Math.max(tasks.length,(maxfreq-1)*(n+1)+maxfreqcount);
    }
}