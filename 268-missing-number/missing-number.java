class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int sum=0;
       int csum=0;
       for(int i=0;i<n;i++){
        csum+=nums[i];
       } 
       for(int i=0;i<=n;i++){
        sum+=i;
       } 
       return sum-csum;
    }
}