class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        
      for(int i=0;i<=n;i++){
        int count=0;
        int m=i;
        while(m!=0){
            int r=m%2;
            if(r==1){
                count++;
            }
            m/=2;

        }arr[i]=count;

      } return arr; 
    }
}