class Solution {
    public int smallestIndex(int[] nums) {
        int  n=nums.length;
        for(int i=0;i<n;i++){
            int rem=0;
            while(nums[i]!=0){
                int r=nums[i]%10;
                rem+=r;
                nums[i]/=10;
            }
            if(i==rem){
                return i;
            }
        }return -1;
    }
}