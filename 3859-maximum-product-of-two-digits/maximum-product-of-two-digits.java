class Solution {
    public int maxProduct(int n) {

int pro=1;
int max=0;
int i=0;
int []arr=new int[50];
       while(n>0){
        arr[i]=n%10;
        n=n/10;
        i++;
       }
       for(int j=0;j<arr.length;j++){
        for(int p=j+1;p<arr.length;p++){
            pro=arr[j]*arr[p];
             max=Math.max(max,pro);
        }
       }return max;

    }
}