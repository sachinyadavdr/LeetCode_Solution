class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n= nums.length;
    
        for(int i=0;i<n;i++){
            int x=Integer.MIN_VALUE;
            int m=Integer.MAX_VALUE;
            for(int j=0;j<i+1;j++){
                 x=Math.max(x,nums[j]);
            }
            for(int j=i;j<n;j++){
                 m=Math.min(m,nums[j]);
            }
             
            if((x-m)<=k){
                return i;
            }


        }
        return -1;
    }
}