class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n<=1){
        return false;
       }
        int max = nums[n - 1];

       if(max!=n-1){
        return false;
       }
        for (int i = 0; i <n-2; i++) {
            if (nums[i] != i + 1) {
                return false;

            }
        }
        if ( nums[n-2]==max) {
            return true;
        }
        return false;
    }
}