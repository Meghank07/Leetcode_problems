class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int m = 0;
        for(int x : sorted){
            if(m==0 || sorted[m-1]!=x){
                sorted[m++]=x;
            }
        }
        int[] unique = Arrays.copyOf(sorted,m);
        for(int i = 0 ; i< n ; i++){
            arr[i] = Arrays.binarySearch(unique,arr[i])+1;
        }
        return arr;
    }
}