class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int l=1;
        int high=x/2;
        int ans=0;
        while(l<=high){
            int mid=(l+high)/2;
            if((long)mid*mid<=x){
                 ans=mid;
                 l=mid+1;
            }
            else{
                high=mid-1;

            }
        }return ans;
    }
}