class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int l=0;
        int r=0;
        int sum=0;
        int minl=Integer.MAX_VALUE;
        while(r<n){
            sum+=nums[r];
            r++;
            while(sum>=target){
                sum-=nums[l];
                l++;
                minl=Math.min(minl,r-l+1);

            }
        }return minl==Integer.MAX_VALUE?0:minl;
    }
}