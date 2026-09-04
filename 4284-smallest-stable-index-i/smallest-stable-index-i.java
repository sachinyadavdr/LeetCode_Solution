class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int x = Integer.MIN_VALUE;
            int v = Integer.MAX_VALUE;
            for (int j = 0; j <= i; j++) {
                x = Math.max(x, nums[j]);
            }
            System.out.println(x);
            for (int p = i; p < n; p++) {
                v = Math.min(v, nums[p]);
            }
            int l = x - v;

            if (l <= k) {
                return i;
            }
        }
        return -1;
    }
}