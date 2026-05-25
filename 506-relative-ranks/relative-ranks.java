class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i = 0 ; i < n ;i++){
            pq.offer(new int[]{score[i],i});
        }
        int rank = 1;
        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            int originalIndex = pair[1];
            
            if (rank == 1) {
                answer[originalIndex] = "Gold Medal";
            } else if (rank == 2) {
                answer[originalIndex] = "Silver Medal";
            } else if (rank == 3) {
                answer[originalIndex] = "Bronze Medal";
            } else {
                answer[originalIndex] = String.valueOf(rank);
            }
            rank++;
        }
        return answer;
    }
}