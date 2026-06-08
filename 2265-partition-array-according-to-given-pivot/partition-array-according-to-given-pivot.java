class Solution {

    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        LinkedList<Integer> less = new LinkedList<>();
        LinkedList<Integer> equal = new LinkedList<>();
        LinkedList<Integer> greater = new LinkedList<>();
        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num > pivot) {
                greater.add(num);
            } else {
                equal.add(num);
            }
        }
        less.addAll(equal);
        less.addAll(greater);

        int a = 0;
        int[] ans = new int[n];
        for (int num : less) {
            ans[a++] = num;
        }
        return ans;
    }
}