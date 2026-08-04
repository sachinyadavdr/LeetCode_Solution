class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        int []arr=new int[n];
        int p=0;
        k=k%n;
        for(int i=n-k;i<=n-1;i++){
            arr[p] = nums[i];
            p++;
        }
        for(int i=0;i<n-k;i++){
            arr[p] = nums[i];
            p++;
        }
        for(int i=0;i<n;i++){
            nums[i] = arr[i];
        
        }
    }
}