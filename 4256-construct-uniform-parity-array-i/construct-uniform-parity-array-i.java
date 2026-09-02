class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int nums2[]=new int[n];
        for(int i=0;i<n-1;i++){
            if(nums1[i+1]%2!=0){
                nums2[i]=nums1[i]-nums1[i+1];

            }else{
                nums2[i]=nums1[i];
            }
        } for(int x:nums2){
            if(x%2==0){
                return true;
            }
            if(x%2!=0){
                return true;
            }
        }return false;
    }
}