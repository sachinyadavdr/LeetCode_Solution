class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        } 
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
 for(int x:set){
    if(x>max){
        tmax = smax;
          smax = max;
                max = x; 
    }
    else if (x > smax) {
                tmax = smax;
                smax = x;
            } 
            else if (x > tmax) {
                tmax = x;
            }
 }
 if(set.size()<3){
    return max;
 }else{
    return tmax;
 }

    }
}