class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        if(n<3) return -1;
        Map<Integer,List<Integer>> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
           List<Integer> lst =  hm.getOrDefault(nums[i],new ArrayList<>());
           lst.add(i);
           hm.put(nums[i],lst);
        }
        int min_distance = Integer.MAX_VALUE;
        for(List<Integer> values : hm.values()){
            if(values.size()>=3){
                for(int x = 0 ; x+2<values.size();x++){
                    int i = values.get(x);
                    int j = values.get(x+1);
                    int z = values.get(x+2);
                    int distance = Math.abs(i-j) + Math.abs(j-z) + Math.abs(z-i);
                    min_distance = Math.min(min_distance,distance);
                }
            }
        }
        return min_distance == Integer.MAX_VALUE ? -1 : min_distance;
    }
}