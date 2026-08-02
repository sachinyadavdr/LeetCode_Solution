class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int ppro[]=new int[nums.length];
        int spro[]=new int[nums.length];
        ppro[0]=1;
        int n=nums.length;
        spro[n-1]=1;
        int[] arr=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            
            ppro[i]=nums[i-1]*ppro[i-1];
        }
        for(int i=n-2;i>=0;i--){
            
            spro[i]=spro[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            
            arr[i]=spro[i]*ppro[i];
        }

return arr;
    }
}