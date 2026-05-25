class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> hm.get(b) - hm.get(a));
        pq.addAll(hm.keySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char p = pq.poll();
            int count = hm.get(p);

            for(int i = 0 ; i < count ; i++){
                sb.append(p);
            }
        }
        return sb.toString();
    }
}