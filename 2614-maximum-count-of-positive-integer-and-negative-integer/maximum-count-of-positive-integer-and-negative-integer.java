class Solution {
    public int maximumCount(int[] nums) {
      int l=0;
      int min=0;
      int max=0;
      int n=nums.length;
      int r=n-1;
      int mid =0;
      while(l<=r){
        mid=(l+r)/2;
        if( nums[mid]<0){
    
            l=mid+1;

        }else if(nums[mid]>=0){
        r=mid-1;}
    
}min =l;


l=0;
r=n-1;
while(l<=r){
        mid=(l+r)/2;
if( nums[mid]<=0){
    
            l=mid+1;

        }else if(nums[mid]>0){
        r=mid-1;}

    
      } max=n-l; 
        return Math.max(min,max) ;
    }
}