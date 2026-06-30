class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3];
        int count = 0;
        int left = 0;
        int n = s.length();
        for(int  i = 0 ; i <n ;i++ ){
            arr[s.charAt(i) - 'a']++;

            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                count += n-i;

                arr[s.charAt(left) - 'a']--;
                left++;
            }
        
        }
        return count;
    }
}