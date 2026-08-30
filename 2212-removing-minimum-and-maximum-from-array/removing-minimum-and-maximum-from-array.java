class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
       
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int in = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                in = i;

            }
            if (nums[i] < min) {
                min = nums[i];
                idx = i;
            }
        }
        int a = Math.max(in, idx) + 1;
        int b = n - Math.min(in, idx);

        int c = in + 1 + (n - idx);
        int d = idx + 1 + (n - in);

        return Math.min(Math.min(a, b), Math.min(c, d));

    }
}