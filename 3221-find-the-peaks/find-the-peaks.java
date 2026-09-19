class Solution {
    public List<Integer> findPeaks(int[] arr) {
        List<Integer>list=new ArrayList<>();
        int n=arr.length-1;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]&&arr[i]>arr[i+1] ){
                list.add(i);
            }
        } return list;
    }
}