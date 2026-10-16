class Solution {
    public int singleNonDuplicate(int[] nums) {
       int r=nums.length-1;
       int l=0;
       int mid=0;
        if (nums.length == 1) {
            return nums[0];
        }
       if(nums[0]!=nums[1]){
        return nums[0];
       }
        if(nums[r]!=nums[r-1]){
        return nums[r];
       }
       while(l<=r){
         mid=(l+r)/2;
         int p=mid;
         int s=mid;
         if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
            return nums[mid];
         }

        if(nums[mid-1]==nums[mid])
{          p=mid-1;
             
        }else{//jab nums[mid]==nums[mid+1]
            p=mid;
            s=mid+1;
            
        }int lc=p-l;
            int rc=r-s;
            if(lc%2==0){
                l=s+1;
            }else{
                r=p-1;
            }
       }return -1;

    }
}