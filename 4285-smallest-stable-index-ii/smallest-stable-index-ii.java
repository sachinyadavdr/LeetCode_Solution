class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n= nums.length;
     int arr[]=new int [n];
     int ar[]=new int [n];
     int x=Integer.MIN_VALUE;
      int m=Integer.MAX_VALUE;
      int l=0;
            for(int j=n-1;j>=0;j--){
                 m=Math.min(m,nums[j]);
            arr[j]=m;
            }
             for(int i=0;i<n;i++){
                x=Math.max(x,nums[i]);
                ar[i]=x;
                l=x-arr[i];
            if(l<=k){
                 return i ;
             }
             
             }
            
        return-1;
    }
}