class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int nums2[]=new int[n];
        int odd=-1;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0){
                odd=nums1[i];
            break;
            }
        } 
        if(odd!=-1){
            for(int i=0;i<n;i++){
            if(nums1[i]%2!=0){
            nums2[i]=nums1[i];
            
            }else{
                nums2[i]=nums1[i]-odd;
            }


            }
        }
            else{
              for(int i=0;i<n;i++){
        nums2[i]=nums1[i];
    }
                }
            
            boolean even=nums2[0]%2==0;
        for(int x:nums2){
            if((x%2==0)!=even){
                return false;
            }
        }
    return true;
    }
}