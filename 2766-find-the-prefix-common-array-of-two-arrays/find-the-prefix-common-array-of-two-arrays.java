class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] C = new int[n];
       
        Set<Integer>  seta = new HashSet<>();
        Set<Integer> setb = new HashSet<>();
        for(int c = 0 ; c < n ; c++){
            seta.add(A[c]);
            setb.add(B[c]);
            int prefix_count = 0;

            for(int element : seta){
                if(setb.contains(element)){
                    prefix_count++;
                }
            }

            C[c] = prefix_count;
        }
        return C;
    }
}