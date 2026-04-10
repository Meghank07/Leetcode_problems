class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        if(n<3) return -1;
        int min_distance = Integer.MAX_VALUE;
        Map<Integer,List<Integer>> hm = new HashMap<>();
        for(int i = 0  ; i < n ;i++){
            List<Integer> lst = hm.getOrDefault(nums[i],new ArrayList<>());
            lst.add(i);
            hm.put(nums[i],lst);
        }
        for(List<Integer> val : hm.values()){
            if(val.size()>=3){
                 for(int x = 0 ; x+2 < val.size() ; x++){
                    int i = val.get(x);
                    int j = val.get(x+1);
                    int k = val.get(x+2);
                    int distance =  Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                    min_distance = Math.min(min_distance,distance);
                 }
            }
        }
        return min_distance == Integer.MAX_VALUE ? -1 : min_distance;
    }
}