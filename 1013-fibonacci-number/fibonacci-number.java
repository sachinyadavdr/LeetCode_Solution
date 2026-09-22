class Solution {
    public int fib(int n) {
       return fibnumber(n);  
    }
     int fibnumber(int n){
        if(n==0||n==1){
            return n;
        }
        return fibnumber(n-1)+fibnumber(n-2);
     }
}