class Solution {
    public int maxProduct(int[] nums) {
        int product=0;
     Arrays.sort(nums);
     int n=nums.length;
                product=(nums[n-1]-1)*(nums[n-2]-1);
            
         
    return product;   
    }
}