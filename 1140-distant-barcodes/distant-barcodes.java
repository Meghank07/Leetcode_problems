class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int code : barcodes) {
            countMap.put(code, countMap.getOrDefault(code, 0) + 1);
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            maxHeap.offer(new int[]{entry.getValue(), entry.getKey()});
        }
        int[] result = new int[barcodes.length];
        int index = 0;
        int[] prev = null;
        while (!maxHeap.isEmpty()) {
            int[] current = maxHeap.poll();
            
            result[index++] = current[1];
            current[0]--; 
            if (prev != null && prev[0] > 0) {
                maxHeap.offer(prev);
            }
            prev = current;
        }

        return result;
    }
}