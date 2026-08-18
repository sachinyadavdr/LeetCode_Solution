class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int []arr1=new int [n/2];
        int []arr2=new int [n/2];
        int []arr=new int[n];
        int i=0;
        int k=0;
        int p=0;
    while(i<n){
        if(nums[i]%2==0){
            arr1[k]=nums[i];
            k++;
        }else{
            arr2[p]=nums[i];
            p++;
        }
        i++;
    }
    k=0;
    p=0;
    for(int j=0;j<n;j++){
        if(j%2==0){
        arr[j]=arr1[k];
        k++;
        }else{
            arr[j]=arr2[p];
p++;        }

    }return arr;
    }
}