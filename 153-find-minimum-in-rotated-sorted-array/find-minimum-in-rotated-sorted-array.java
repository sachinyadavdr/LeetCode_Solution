class Solution {
    public int findMin(int[] nums) {
     int r=nums.length-1;
     int l=0;
     while(l<=r){
        int mid=(l+r)/2;
        if(nums[mid]>nums[r]){
            l=mid+1;
        }else{
            r=mid;
        }
        if(r==l){
            return nums[l];
        }
     }
return -1;
    }
}