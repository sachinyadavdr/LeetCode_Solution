class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int[] nums=new int [n];
        
        int k=0;
        
        for(int i=0;i<m;i++){
            int p=arr2[i];
            for(int j=0;j<n;j++){
                if(arr1[j]==p){
                    nums[k]=arr1[j];
                    k++;                
            }
            }
        }
        int s=k;
        for(int i = 0; i < n; i++) {
    boolean found = false;

    for(int j = 0; j < m; j++) {
        if(arr1[i] == arr2[j]) {
            found = true;
            break;
        }
    }
    if(!found){
        nums[k]=arr1[i];
        k++;
    }    
            }    Arrays.sort(nums,s, n);

        return nums;
}
}