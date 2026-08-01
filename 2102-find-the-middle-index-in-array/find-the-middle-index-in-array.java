class Solution {
    public int findMiddleIndex(int[] arr) {
     
        int mid=0;
        for(int i=0;i<arr.length;i++){
            int lsum=0;
            int rsum=0;
         mid=arr[i];
         for(int j=i+1;j<arr.length;j++){
            rsum+=arr[j];
         } if(i>0){
         for(int k=0;k<i;k++){
            lsum+=arr[k];
            
         }}System.out.println(rsum);
         System.out.println(lsum);
         if(rsum-lsum==0){
            return i;
         }


        }
        return -1;
    }
}