class Solution {
    public int findNumbers(int[] nums) {

 int c=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int x=nums[i];
            while(x!=0){
                int rem=x%10;
                count++;
                x/=10;
            }
              if(count%2==0){
           
            c++;}
        }
       
        return c;
    }
}