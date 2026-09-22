class Solution {
    public int arrangeCoins(int n) {
        
      return (sqr(8L*n+1)-1)/2;
    }

     public int sqr(long n){
        if(n<2){
            return(int) n;
        }
        long l=0;
        long r=n;
         while(l<=r){
            long mid=l+(r-l)/2;
            if(mid==n/mid){
                return (int)mid;
            }
            else if(mid>n/mid){
                r=mid-1;
            }else{
                l=mid+1;
            }

        }return (int) r;
    }
}