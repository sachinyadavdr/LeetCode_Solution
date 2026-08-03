class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        while(n>0){
            int p=n%10;
            pro*=p;
            sum+=p;
            n=n/10;

        }
        
            return pro-sum;
        
    }
}