class Solution {
    public int pivotIndex(int[] nums) {
      int n=nums.length;
      int totalsum=0;
      int x=0;
      for(int i=0;i<n;i++){
        totalsum+=nums[i];
      }  int presum=0;
      for(int i=0;i<n;i++){
        x=totalsum-(nums[i]+presum);
        if(presum==x){
            return i;
        }
        presum+=nums[i];
 
      }
      

      return-1;
    }
}