class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
         int small= 0;
         int large=nums[n-1];
          int ind=0;
         for(int i=small;i<large;i++){
            if(nums[ind]==i){
                ind++;
            }else{
                return i;
            }
         }
         for(int j=0;j<n;j++){
            if(nums[j]!=n){
                return n;

            }
         }
         return 0;
    }
}