class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int tem=0;
        if(n==0){
            return 0;

        }
        else if(n==1){
            return 1;
        }
        else{
         for( int i=1; i<n;i++){
            tem=a+b;
            a=b;
            b=tem;
         }return tem;
        }
    }
}